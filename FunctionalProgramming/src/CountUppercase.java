import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> startsWithUpperCase = w -> Character.isUpperCase(w.charAt(0));
        List<String> word = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(startsWithUpperCase)
                .collect(Collectors.toList());
        System.out.println(word.size());

        System.out.println(word.stream()
                .collect(Collectors.joining(System.lineSeparator())));

    }
}
