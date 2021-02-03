import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();
        for (int i = input.length - 1; i >= 0; i--) {
            stack.push(input[i]);
        }
        int result = 0;
        result = result + Integer.valueOf(stack.pop());
        while (stack.size() > 1) {
            String currentElement = stack.pop();
            if (currentElement.equals("+")) {
                result = result + Integer.valueOf(stack.pop());
            } else if (currentElement.equals("-")) {
                result = result - Integer.valueOf(stack.pop());
            }
        }
        System.out.println(result);
    }
}
