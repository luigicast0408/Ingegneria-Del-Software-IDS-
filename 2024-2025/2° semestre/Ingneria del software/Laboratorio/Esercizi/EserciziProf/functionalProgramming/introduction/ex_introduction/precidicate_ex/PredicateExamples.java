package precidicate_ex;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.List;

public class PredicateExamples {
    public static void main(String[] args) {
        Predicate<Integer> positive = number -> number >= 0;


        Stream.of(2, 5, 10, -1)
                .filter(positive)
                .forEach(System.out::println);

        List<Integer> distinctEvenNumbers = Stream.of(2, 3, 12, 5, 7, 1, 20, 21, 0)
                .filter(number -> number % 2 == 0)
                .distinct()
                .toList();

        System.out.println("Distinct even numbers: " + distinctEvenNumbers +
                " | Total elements: " + distinctEvenNumbers.size());

        List<Integer> distinctOddNumbers = Stream.of(2, 3, 12, 5, 7, 1, 20, 21, 0)
                .filter(number -> number % 2 != 0 && number >3)
                .distinct()
                .toList();


        System.out.println("Distinct odd numbers: " + distinctOddNumbers +
                " | Total elements: " + distinctOddNumbers.size());

        List<Double> prices = Arrays.asList(12.2, 13.3, 78.6, 0.0);
        prices.stream().
                filter(price -> price > 0.0)
                .forEach(System.out::println);
    }
}
