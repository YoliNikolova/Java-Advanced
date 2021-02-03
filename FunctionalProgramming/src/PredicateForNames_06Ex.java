import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames_06Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");

        Predicate<String> predicate = name -> name.length()<=n;
       // for (String name : names) {
       //    if(predicate.test(name)){
        //       System.out.println(name);
        //   }
       // }
        Arrays.stream(names).filter(predicate).forEach(e-> System.out.println(e));
    }
}
