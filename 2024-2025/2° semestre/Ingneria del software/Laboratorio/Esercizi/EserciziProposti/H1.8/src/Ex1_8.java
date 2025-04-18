import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Ex1_8 {
    public static void main(String[] args) {
        List<String> stringsList = Arrays.asList("a", "ab", "abc", "b", "bc", "bcd", "cde");

        List<String> result = IntStream.range(1, stringsList.size())
                .filter(i -> stringsList.get(i).length() > stringsList.get(i - 1).length())
                .mapToObj(stringsList::get)
                .toList();
        result.forEach(System.out::println);
    }
}

