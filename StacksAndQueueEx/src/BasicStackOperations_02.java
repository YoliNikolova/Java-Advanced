import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(firstLine[0]);
        int s = Integer.parseInt(firstLine[1]);
        int x = Integer.parseInt(firstLine[2]);

        int min = Integer.MAX_VALUE;

        String[] numbers = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> stackNumbers = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            stackNumbers.push(Integer.parseInt(numbers[i]));
        }
        for (int i = 0; i < s; i++) {
            stackNumbers.pop();
        }
        if (stackNumbers.isEmpty()) {
            System.out.println(0);
        } else {
            if (stackNumbers.contains(x)) {
                System.out.println("true");
            } else {
                //min element
                while (stackNumbers.size() > 0) {
                    if (stackNumbers.peek() < min) {
                        min = stackNumbers.pop();
                    } else {
                        stackNumbers.pop();
                    }
                }
                System.out.println(min);
            }
        }
    }
}
