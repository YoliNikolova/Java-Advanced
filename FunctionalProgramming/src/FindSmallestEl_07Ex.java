import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSmallestEl_07Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        Function<List<Integer>,Integer> minElement = list -> {
            return list.lastIndexOf(Collections.min(list));
        };

        System.out.println(minElement.apply(numbers));
    }
}
