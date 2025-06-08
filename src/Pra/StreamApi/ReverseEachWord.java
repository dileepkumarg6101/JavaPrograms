package Pra.StreamApi;
/*
Reverse each word of a String and print the final String
 */

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWord {
    public static void main(String[] args) {
        String string = "Today is a beautiful day";

        String reverseString = Stream.of(string.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.print("Final string: " +reverseString );



    }
}
