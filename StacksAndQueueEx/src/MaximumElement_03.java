import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // int max = Integer.MIN_VALUE;

        for (int i = 0; i < countCommands; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            // [1 X], [2] , [3]
            int number = Integer.parseInt(command[0]);
            if(number==1){
                int numberToPush = Integer.parseInt(command[1]);
                stack.push(numberToPush);
            }else if(number==2){
                stack.pop();
            }else if(number==3){
                System.out.println(Collections.max(stack));
            }
        }
    }
}
