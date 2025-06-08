package Pra.StreamApi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Find duplicate elements from an array
 */
public class FindDuplicateElements {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.addAll(List.of(1, 2, 4, 2, 1, 5, 5, 5));

        Set<Integer> set = new HashSet<>();
        listOfIntegers.stream()
                .filter(i -> !set.add(i))
                .collect(Collectors.toSet())
                .forEach(i -> System.out.println( i + " "));
    }
}
