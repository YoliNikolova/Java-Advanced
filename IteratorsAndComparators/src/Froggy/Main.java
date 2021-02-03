package Froggy;


import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] stones = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Lake lake = new Lake(stones);
        Iterator it = lake.iterator();

        StringBuilder builder = new StringBuilder();
        while(it.hasNext()){
            builder.append(it.next()).append(", ");
        }
        System.out.println(builder.toString().substring(0,builder.toString().lastIndexOf(", ")));
    }
}
