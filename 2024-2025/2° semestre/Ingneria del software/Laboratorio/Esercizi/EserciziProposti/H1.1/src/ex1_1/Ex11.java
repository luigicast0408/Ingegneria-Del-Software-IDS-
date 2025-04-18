package ex1_1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\nInsert Prefix\n");
        String prefix = in.next();
        List<String> stringList = Arrays.asList("author", "auto", "autocorrect", "begin", "big", "bigger", "biggish");
        List <String> result = stringList.stream()
                .filter(word -> word.contains(prefix))
                .toList();
        System.out.println(result);
    }
}
