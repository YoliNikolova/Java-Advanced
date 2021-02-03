import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (int i = 0; i < children.length; i++) {
            queue.offer(children[i]);
        }

        while(queue.size()>1){
            //n - countChildren
            for (int i = 0; i < n-1; i++) {
                queue.offer(queue.poll());
            }
            System.out.printf("Removed %s%n",queue.poll());
        }
        System.out.printf("Last is %s",queue.poll());
    }
}
