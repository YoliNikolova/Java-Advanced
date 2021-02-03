import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class ListOfPredicate_08Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        BiFunction<List<Integer>,Integer,Boolean> predicate =((list,number)->{
            boolean flag = true;
            for (Integer integer : list) {
                if(number %integer!=0){
                    return false;
                }
            }
            return true;
        });
        for (int i = 1; i <= n ; i++) {
            if(predicate.apply(numbers,i)){
                System.out.print(i + " ");
            }
        }
    }
}
