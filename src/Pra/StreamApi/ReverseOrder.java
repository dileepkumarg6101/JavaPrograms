package Pra.StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReverseOrder {
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

//        Sort given list in reverse order
        integerList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(i -> System.out.print(i + " "));
        System.out.println();
        stringList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(i -> System.out.print(i + " "));
        System.out.println();

//        Print multiple of 3 from given list of integers
        integerList.stream()
                .filter(i -> i%3==0)
                .forEach(i -> System.out.print(i +" "));






        





    }
}
