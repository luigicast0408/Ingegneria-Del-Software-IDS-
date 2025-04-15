package ex1;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // generate 10 number pow 2
        Stream.iterate(2, num -> num * 2)
                .limit(10)
                .forEach(System.out::println);
    }
}
