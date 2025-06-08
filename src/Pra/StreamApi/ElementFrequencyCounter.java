package Pra.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
/*
Calculate the frequency of each element in an array (i.e. how many times an element has occurred in the list)
 */
public class ElementFrequencyCounter {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.addAll(List.of(1, 2, 4, 2, 1, 5, 5, 5));

        listOfIntegers.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(e -> System.out.println(e.getKey()+ ":"+ e.getValue()));




    }

}
