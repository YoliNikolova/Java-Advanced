
import java.util.Arrays;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;


public class Arithmetic_04Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int[] list = new int[input.length];

        for (int i = 0; i < list.length; i++) {
            list[i]=Integer.parseInt(input[i]);
        }

        Function<int[],int[]> increment = l -> Arrays.stream(l).map(e -> e += 1).toArray();
        Function<int[],int[]> multiply= l -> Arrays.stream(l).map(e -> e *= 2).toArray();
        Function<int[],int[]> decrement = l -> Arrays.stream(l).map(e -> e -= 1).toArray();
        Consumer<int[]> print = l -> Arrays.stream(l).forEach(e -> System.out.print(e + " "));

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "add":
                  list =  increment.apply(list);
                    break;
                case "multiply":
                   list = multiply.apply(list);
                    break;
                case "subtract":
                  list =  decrement.apply(list);
                    break;
                case "print":
                    print.accept(list);
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
