package ex1_6;

import java.util.Arrays;
import java.util.List;

public class Ex16 {
    public static void main(String[] args) {
        List<String> isPalindrome = Arrays.asList("anna", "ciao", "otto", "redivider");

        List <String> result = isPalindrome.stream()
                .filter(string -> string
                        .contentEquals(new StringBuilder(string)
                        .reverse()))
                .toList();
        System.out.println(result);
    }


}
