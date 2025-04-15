package peek1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,4,5);
        numbers.stream()
                .map(number -> number +17)
                .peek(number -> System.out.println("after map: "+ number))
                .filter(number -> number % 2 == 0 )
                .peek(number -> System.out.println("after filtering: "+ number))
                .limit(3)
                .peek(number -> System.out.println("after limit: "+ number))
                .toList();
    }
}
