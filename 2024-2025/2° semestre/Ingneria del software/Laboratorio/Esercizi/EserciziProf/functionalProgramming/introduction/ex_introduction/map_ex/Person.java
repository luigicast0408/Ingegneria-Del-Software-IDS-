package map_ex;

import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private int age;
    private List<Person> friends;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.friends = List.of();
    }

    public Person(String name, int age, List<Person> friends) {
        this.name = name;
        this.age = age;
        this.friends = friends;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSumAgesOfFriends() {
        return friends.stream()
                .map(Person::getAge)
                .reduce(0, Integer::sum);
    }

    public int getSumAgesOfFriendsAlternative(){
        return friends.stream()
                .map(Person::getAge)
                .reduce(0, (person1,person2) -> person1 + person2);
    }
}