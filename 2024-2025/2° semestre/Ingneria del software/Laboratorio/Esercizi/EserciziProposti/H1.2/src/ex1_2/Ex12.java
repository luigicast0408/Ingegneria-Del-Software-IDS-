package ex1_2;

import java.util.Arrays;
import java.util.List;

public class Ex12 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("to", "speak", "the", "truth", "and", "pay", "your", "debts");
        List<String> result = stringList.stream()
                .map(word ->word.substring(0,1))
                .toList();
        System.out.println(result);
    }
}
