package intStream1;
import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // IntStream is a stream of int values
        IntStream.rangeClosed(1,8)
                .map(num -> num * num)
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        int result = Stream.of("truth", "flows", "to", "them", "sweetly", "by", "nature")
                        .mapToInt(String::length).sum();
        System.out.println("result: " +result);

        Stream<Integer> numbers = IntStream.rangeClosed(1, 10)
                .boxed(); //Converts each primitive int into an Integer object (boxing), turning it into a Stream<Integer>.
        numbers.forEach(System.out::println);

        List<Person> personList = Arrays.asList(
                new Person("luigi",20)
        );
        Stream<Person> personStream = IntStream.rangeClosed(0,3)
                .mapToObj(personList::get);

    }
}
