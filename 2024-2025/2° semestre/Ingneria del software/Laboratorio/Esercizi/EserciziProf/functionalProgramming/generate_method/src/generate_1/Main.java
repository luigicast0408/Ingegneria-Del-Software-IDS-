package generate_1;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // generate  5 random number  0 < number < 10
        Stream.generate(() -> Math.round(Math.random()*10))
                .limit(5)
                .forEach(System.out::println);
    }
}
