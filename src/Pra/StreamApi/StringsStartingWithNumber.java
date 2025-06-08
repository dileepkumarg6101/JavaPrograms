package Pra.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StringsStartingWithNumber {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1DIleep");
        list.add("2kumar");
        list.add("dilkush");

        list.stream()
                .filter(s -> Character.isDigit(s.charAt(0)))
                .forEach(i -> System.out.println(i + " "));


    }
}
