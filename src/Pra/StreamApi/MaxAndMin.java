package Pra.StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxAndMin {
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
//        Find Maximum and Minimum in a list

        int min = integerList.stream()
                .min(Comparator.naturalOrder())
                .get();

        int max = integerList.stream()
                .max(Comparator.naturalOrder())
                .get();

        System.out.println("max: "+ max);
        System.out.println("min: "+ min);


    }
}
