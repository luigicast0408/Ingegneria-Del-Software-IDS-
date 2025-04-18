package ex1_3;

import java.util.*;

public class Ex13 {
    public static void main(String[] args) {
        List<int[]> terneList = Arrays.asList(
                new int[]{2, 3, 4},
                new int[]{1, 1, 3},
                new int[]{5, 5, 5}
        );

        List<Integer> result = terneList.stream()
                .filter(triangle -> isTriangle(triangle[0], triangle[1], triangle[2]))
                .map(t -> t[0] + t[1] + t[2])
                .toList();
        System.out.println(result);
    }

    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
