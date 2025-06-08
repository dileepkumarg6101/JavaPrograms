package Pra.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEvenSeparator {
    public static void main(String[] args) {
        // Create sample numeric list
        List<Integer> integerList = new ArrayList<>();
        integerList.add(9);
        integerList.add(7);
        integerList.add(3);
        integerList.add(5);
        integerList.add(2);
        integerList.add(4);

        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("z");
        stringList.add("g");
        stringList.add("b");
        stringList.add("c");
        // Separate Odd and Even Numbers from given list of Integers

        Map<Boolean, List<Integer>> map = integerList.stream()
                .collect(Collectors.groupingBy(i -> i % 2 == 0));

        System.out.println("Even Numbers: " + map.get(true));

        System.out.println("Odd Numbers: " + map.get(false));


    }
}
