import java.util.Scanner;

public class FilterByAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n= Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split(", ");
            String name = info[0];
            int age = Integer.parseInt(info[1]);

        }
    }
}
