package ex1;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 100)
                .boxed()
                .toList();

        long startSequential = System.nanoTime();
        int sumSequential = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        long endSequential = System.nanoTime();
        System.out.println("Sum (sequential): " + sumSequential);
        System.out.println("Time (sequential): " + (endSequential - startSequential) + " ns");

        long startParallel = System.nanoTime();
        int sumParallel = numbers.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();
        long endParallel = System.nanoTime();
        System.out.println("Sum (parallel): " + sumParallel);
        System.out.println("Time (parallel): " + (endParallel - startParallel) + " ns");
    }
}
