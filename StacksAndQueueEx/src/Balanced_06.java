import java.util.ArrayDeque;
import java.util.Scanner;

public class Balanced_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. ако скобата е отворена я запазваме
        //2. ако е затворена търсим в отворените , търсим в отворените дали последната отворена отг. на намерената затворената
        ArrayDeque<Character> openBrackets = new ArrayDeque<>();
        String input = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < input.length(); i++) {
            char currentBracket = input.charAt(i);
            if (currentBracket == '{' || currentBracket == '(' || currentBracket == '[') {
                openBrackets.push(currentBracket);
            } else if (currentBracket == '}' || currentBracket == ')' || currentBracket == ']') {
                if (openBrackets.isEmpty()) {
                    flag = false;
                    break;
                }
                char openBracket = openBrackets.pop();
                if (currentBracket == ')' && openBracket != '(') {
                    flag = false;
                } else if (currentBracket == ']' && openBracket != '[') {
                    flag = false;
                } else if (currentBracket == '}' && openBracket != '{') {
                    flag = false;
                }
            }
        }
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
