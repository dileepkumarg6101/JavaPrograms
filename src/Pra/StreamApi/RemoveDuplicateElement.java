package Pra.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("z");
        stringList.add("g");
        stringList.add("b");
        stringList.add("c");
        stringList.add("c");

//        Remove duplicate elements from the given list
        stringList.add("a");

        stringList.stream()
                .distinct()
                .toList()
                .forEach(i -> System.out.print(i + " "));





    }
}
