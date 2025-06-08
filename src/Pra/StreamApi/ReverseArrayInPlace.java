package Pra.StreamApi;

import java.util.stream.IntStream;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int[] intArr ={4, 5, 2, 9, 6};
        System.out.println("Reversed array using stream (not in-place):");

        IntStream.rangeClosed(1, intArr.length)
                .map(i -> intArr[intArr.length-i])
                .forEach(i -> System.out.print(i + " "));
    }
}
