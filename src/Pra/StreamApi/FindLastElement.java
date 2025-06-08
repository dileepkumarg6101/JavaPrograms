package Pra.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class FindLastElement {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("z");
        stringList.add("g");
        stringList.add("b");
        stringList.add("c");

        if (!stringList.isEmpty()) {


            String lastElement = stringList.stream()
                    .skip(stringList.size() - 1)
                    .findFirst()
                    .get();
            System.out.println("last element: " + lastElement);
        }
    }
}
