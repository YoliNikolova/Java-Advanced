import java.util.ArrayDeque;
import java.util.Scanner;

public class QueueOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(firstLine[0]);
        int s = Integer.parseInt(firstLine[1]);
        int x = Integer.parseInt(firstLine[2]);

        int min = Integer.MAX_VALUE;

        String[] numbers = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> queueNumbers = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            queueNumbers.offer(Integer.parseInt(numbers[i]));
        }
        for (int i = 0; i < s; i++) {
            queueNumbers.poll();
        }
        if (queueNumbers.isEmpty()) {
            System.out.println(0);
        } else {
            if (queueNumbers.contains(x)) {
                System.out.println("true");
            } else {
                //min element
                while (queueNumbers.size() > 0) {
                    if (queueNumbers.peek() < min) {
                        min = queueNumbers.poll();
                    } else {
                        queueNumbers.poll();
                    }
                }
                System.out.println(min);
            }
        }
    }
}

