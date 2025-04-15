package ex1;

import java.util.List;
import java.util.Optional;

public class PersonList {


    public static void main(String[] args) {
        List<Person> team = List.of(
                new Person("Kent", 29, "CTO"),
                new Person("Luis", 25, "Programmer"),
                new Person("Al", 25, "Programmer"),
                new Person("Pippo", 29, "CTO")
        );

        // find all programmer
        Optional<Person> findRole = team.stream()
                .filter(person -> person.role().equals("Programmer"))
                .findAny();
        findRole.ifPresent(person -> System.out.println(person.name()));

        // find the fist CTO (Kent)
        findRole = team.stream()
                .filter(person -> person.role().equals("CTO"))
                .findFirst();
        findRole.ifPresent(person -> System.out.println(person.name()));
    }
}
