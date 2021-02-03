package StrategyPattern;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        int result = Integer.compare(person1.getAge(),person2.getAge());
        return result;
    }
}
