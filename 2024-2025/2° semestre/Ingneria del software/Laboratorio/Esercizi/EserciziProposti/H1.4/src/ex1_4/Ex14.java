package ex1_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex14 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 5, 7, 8);
        List<int[]> triangleSides = findTriangles(list);

        for (int[] triangle : triangleSides) {
            System.out.println(Arrays.toString(triangle));
        }
    }

    public static List<int[]> findTriangles(List<Integer> list) {
        return IntStream.range(0, list.size() - 2)
                .mapToObj(i -> new int[]{list.get(i), list.get(i + 1), list.get(i + 2)})
                .filter(t -> isTriangle(t[0], t[1], t[2]))
                .toList();
    }

    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
