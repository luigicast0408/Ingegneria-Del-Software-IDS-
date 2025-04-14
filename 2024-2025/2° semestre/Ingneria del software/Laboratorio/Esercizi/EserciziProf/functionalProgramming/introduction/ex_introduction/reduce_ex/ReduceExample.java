package reduce_ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReduceExample {
    public static void main(String[] args) {
        int sum = Stream.of(2, 3, 12, 5, 7, 1, 20, 21, 0, -1)
                .filter(number -> number > 0)
                .reduce(0, Integer::sum); //(num1,num2) -> num1+num2
        System.out.println(sum);

        int multiply = Stream.of(2, 3, 12, 5, 7, 1, 20, 21, 0, -1)
                .filter(number -> number > 0)
                .reduce(1, (num1, num2) -> num1 * num2);
        System.out.println(multiply);

        List<Double> prices = Arrays.asList(12.2, 13.3, 78.6, 0.0);
        double sumPrices = prices
                .stream()
                .filter(price -> price > 0.0)
                .reduce(0d, Double::sum);
        System.out.println(sumPrices);
    }
}
