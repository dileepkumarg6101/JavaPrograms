package Pra.Java8CodingProbs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
2. Filter even numbers from a list using Streams.
 */
public class FilterEvenNumbersUsingStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6);

        list.stream()
                .filter(i -> i%2==0)
                .collect(Collectors.toList())
                .forEach(i -> System.out.print(i + " "));

    }
}
