import javafx.print.Collation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Reverse_05Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> predicate = number -> number % n == 0;
        Consumer<List<Integer>> printList = l -> l.forEach(e-> System.out.print(e + " "));

        list.removeIf(predicate);
        Collections.reverse(list);

        printList.accept(list);
    }
}
