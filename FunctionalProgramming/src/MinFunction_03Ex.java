import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class MinFunction_03Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i]=Integer.parseInt(input[i]);
        }
        Function<int[],Integer> getMin = arrNumber-> Arrays.stream(arrNumber).min().getAsInt();
        System.out.println(getMin.apply(numbers));
    }
}
