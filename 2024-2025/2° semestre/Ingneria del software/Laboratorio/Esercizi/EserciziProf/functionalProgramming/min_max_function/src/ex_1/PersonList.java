package ex_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class PersonList {
    private static final List<Person> friends = Arrays.asList(
            new Person("Saro", 20, 168, 64.5f, true),
            new Person("Taro", 24, 174, 58.4f, false),
            new Person("Mario", 19, 175, 72.2f, true),
            new Person("Luigi", 25, 181, 70.0f, true)
    );

    public static void main(String[] args) {
        Optional<Person> personMax = friends.stream()
                .filter(person -> person.age() < 20)
                .max(Comparator.comparing(Person::age));
        System.out.println(personMax.isPresent() ? personMax.get().name() : null);

        Optional<Person> personHeightMax = friends.stream()
                .filter(person -> person.height() > 100)
                .max(Comparator.comparing(Person::height));
        System.out.println(personHeightMax.map(Person::name).orElse(null));
    }
}
