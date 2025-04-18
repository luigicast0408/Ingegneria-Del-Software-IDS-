package H1_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Ex15 {
    public static void main(String[] args) {
        List<Integer> isSorted = Arrays.asList(2, 3, 5, 6, 7);

        boolean isOrdered = IntStream.range(0, isSorted.size() - 1)
                .noneMatch(i -> isSorted.get(i) > isSorted.get(i + 1));
        System.out.println("The list is sorted: " + isOrdered);
    }
}
