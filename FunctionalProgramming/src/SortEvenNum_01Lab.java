import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNum_01Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(", ");

        String output1 = Arrays.stream(strings)
                .mapToInt(e-> Integer.parseInt(e))
                .filter(num->num%2==0)
                .sorted()
                .mapToObj(e->String.valueOf(e))
                .collect(Collectors.joining(", "));



        String output2 = Arrays.stream(strings)
                .mapToInt(e-> Integer.parseInt(e))
                .filter(num->num%2==0)
                .mapToObj(e->String.valueOf(e))
                .collect(Collectors.joining(", "));

        System.out.println(output2);
        System.out.println(output1);
    }
}
