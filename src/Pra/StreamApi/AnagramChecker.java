package Pra.StreamApi;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramChecker {
    public static void main(String[] args) {
        String s1 = "heart";
        String s2 = "earth";

        s1 = Stream.of(s1.split(""))
                .map(String:: toUpperCase)
                .sorted()
                .collect(Collectors.joining());

        s2 = Stream.of(s2.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());

        System.out.println(s1 + " and " + s2 +" are " + " Anagrams? -----> "+ s1.equals(s2));




    }
}
