package Pra.StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopThreeMinMax {
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

//        Print 3 max and min numbers from the given list of integers

        integerList.stream()
                .sorted()
                .limit(3)
                .forEach(i -> System.out.print(i + ""));
        System.out.println();

        integerList.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(i -> System.out.print(i + ""));

        System.out.println("Sort the list of given strings in increasing order of their length\n");

        stringList.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(i -> System.out.print(i + " "));
        System.out.println();

        System.out.println("If you want to sort first by length and then alphabetically (for same-length strings):");

        stringList.stream()
                .sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()))
                .forEach(i -> System.out.print(i + " "));
    }
}
