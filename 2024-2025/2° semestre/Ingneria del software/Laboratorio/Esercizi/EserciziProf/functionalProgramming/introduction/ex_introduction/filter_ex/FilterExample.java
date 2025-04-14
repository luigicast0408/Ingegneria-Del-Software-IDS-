package filter_ex;

import java.util.List;
import java.util.stream.Stream;

public class FilterExample {
    public static void main(String[] args) {
        // show all occurrences of "Nobi"
        List<String> name = List.of("Nobita", "Nobi", "Suneo");
        long count = name.stream()
                .filter(string -> string.equals("Nobi")) // for all string check if the is eq "Nobi"
                .count(); // count the occurrences of word

        // OR
        Stream<String> string1 = name.stream();
        Stream<String> string2 = string1.filter(string -> string.equals("Nobi"));
        long count1 = string2.count();
        System.out.println(count1);

        // show all word of 5 letters
        long countWord = name.stream().
                filter(string -> string.length() == 5)
                .count();
        System.out.println(countWord);

        // count how  string is empty
        long countEmptyWord = name.stream().
                filter(String::isEmpty) //  or string.isEmpty
                .count();
        System.out.println(countEmptyWord);
    }
}
