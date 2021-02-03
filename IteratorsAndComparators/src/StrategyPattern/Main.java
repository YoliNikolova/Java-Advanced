package StrategyPattern;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeSet<Person> compareByName = new TreeSet<>(new PersonNameComparator());
        TreeSet<Person> compareByAge = new TreeSet<>(new PersonAgeComparator());

        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("\\s+");
            Person person = new Person (info[0],Integer.parseInt(info[1]));
            compareByName.add(person);
            compareByAge.add(person);
        }

        compareByName.forEach(p-> System.out.println(p));
        compareByAge.forEach(p-> System.out.println(p));
    }
}
