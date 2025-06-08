package Pra.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/*
Calculate the Sum of first 10 natural numbers
 */
public class SUmOfFirst10NaturalNumbers {
    public static void main(String[] args) {

        int sum = IntStream.range(1,11)
                .sum();
        System.out.println("sum is: "+sum);
    }

}
