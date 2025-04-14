package map_ex;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> friends = List.of(
                new Person("Luigi", 20),
                new Person("Ciccio", 21)
        );

        List<Integer> lengths = friends.stream()
                .map(person -> person.getName().length())
                .toList();

        Person mario = new Person("Mario", 25, friends);

        System.out.println("Name: " + mario.getName());
        System.out.println("Age: " + mario.getAge());
        System.out.println("Sum friends age: " + mario.getSumAgesOfFriends());
        System.out.println("Sum friends age alternative: " + mario.getSumAgesOfFriendsAlternative());
    }
}
