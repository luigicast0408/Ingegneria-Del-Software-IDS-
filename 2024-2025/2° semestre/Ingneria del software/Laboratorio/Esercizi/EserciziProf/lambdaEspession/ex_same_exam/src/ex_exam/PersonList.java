package ex_exam;

import java.util.Arrays;
import java.util.List;

public class PersonList {
    private static final List<Person> friends = Arrays.asList(
            new Person("Saro", 20, 168, 64.5f, true),
            new Person("Taro", 24, 174, 58.4f, false),
            new Person("Mario", 19, 175, 72.2f, true),
            new Person("Luigi", 25, 181, 70.0f, true)
    );

    public static void main(String[] args) {
        // calculate average weight of all friends
        float weightTot = friends.stream()
                .map(Person::weight)
                .reduce(0f, Float::sum);
        System.out.println(weightTot / friends.size());

        // calculate the average weight of friends who are at least 172cm tall
        long countFriends = friends.stream()
                .filter(friend -> friend.height() >= 172)
                .count();

        weightTot = friends.stream()
                .filter(friend -> friend.height() >= 172)
                .map(Person::weight)
                .reduce(0f, Float::sum);
        float weightAvg = countFriends == 0 ? 0 : weightTot / countFriends;
        System.out.println(weightAvg);

        // calculate average height of all friends
        int heightTot = friends.stream()
                .map(Person::height)
                .reduce(0, Integer::sum);
        System.out.println(heightTot / friends.size());

        // how many people have a car?
        long countCarPerson = friends.stream()
                .map(Person::haveCar)
                .count();
        System.out.println(countCarPerson);

        // print the name of the person who has weight/height ratio < 0.5
        float ratioWeightHeight = 0.35f;
        friends.stream()
                .filter(person -> person.weight()/person.height() < ratioWeightHeight)
                .forEach(System.out::println);

    }
}
