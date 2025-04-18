import java.util.Arrays;
import java.util.List;

public class Ex1_7 {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(123,45,7,21);
        numbersList.stream()
                .filter( number -> number > 0)
                .map(number -> Integer.toString(number)
                        .chars()
                        .map(car -> car - '0' )
                        .sum())
                .forEach(System.out::println);

    }
}
