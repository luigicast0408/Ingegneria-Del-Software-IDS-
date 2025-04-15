package ex_exam2;

import java.util.Arrays;
import java.util.List;

public class PersonList {
    private static final List<Person> friends = Arrays.asList(
            new Person("Saro", 20, 168, 64.5f, "Goalkeeper"),
            new Person("Taro", 24, 174, 58.4f, "Back"),
            new Person("Mario", 19, 175, 72.2f, "Central Midfielder"),
            new Person("Luigi", 25, 181, 70.0f, "Striker")
    );


    public static void main(String[] args) {
        // print the names of people who are not Back
        friends.stream()
                .filter(person -> !person.role().equals("Back"))
                .map(Person::name)
                .distinct()
                .forEach(System.out::println);
        System.out.println("---------");

        // print the role of people
        friends.stream()
                .map(Person::role)
                .forEach(System.out::println);
        // OR
        List<String> rolePersons = friends.stream()
                .map(Person::role)
                .distinct()
                .toList();
        System.out.println(rolePersons);
    }
}
