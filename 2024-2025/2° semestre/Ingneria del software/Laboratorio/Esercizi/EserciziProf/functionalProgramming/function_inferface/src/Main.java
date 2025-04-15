import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //  there are two parameters a string and an integer that is a len of a string
        Function<String, Integer> stringLength = String::length;
        int result = Stream.of("truth", "flows", "to", "them", "sweetly", "by", "nature")
                        .map(stringLength)
                        .reduce(0, Integer::sum);
        System.out.println(result);
    }
}
