package ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Person> people = new ArrayList<>();

        while (!input.equals("END")) {
            String[] info = input.split("\\s+");
            Person person = new Person(info[0], Integer.parseInt(info[1]), info[2]);
            people.add(person);
            input = scanner.nextLine();
        }
        int n = Integer.parseInt(scanner.nextLine());
        Person personForCompare = people.get(n - 1);
        people.remove(n - 1);

        int count = 1;
        for (Person person : people) {
            if (personForCompare.compareTo(person) == 0) {
                count++;
            }
        }

        if (count == 1) {
            System.out.println("No matches");
        } else {
            System.out.println(count + " " + (people.size() + 1 - count) + " " + (people.size() + 1));
        }
    }
}
