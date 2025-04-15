package ex1;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> team = List.of(
                new Person("Kent", 29, "CTO"),
                new Person("Luis", 25, "Programmer"),
                new Person("Al", 25, "Programmer")
        );

        team.stream()
                .filter(person -> person.age() < 26)
                .filter(person -> person.role().equals("Programmer"))
                .sorted(Comparator.comparing(Person::name))
                .forEach(person -> System.out.println(person.name() + " - " + person.role()));
    }
}
