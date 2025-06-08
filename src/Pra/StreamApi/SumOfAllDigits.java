package Pra.StreamApi;

import java.util.stream.Stream;

/*
Calculate the Sum of all digits of a number
 */
public class SumOfAllDigits {
    public static void main(String[] args) {
        String number = "1234554321";
        long sum = Stream.of(number.split(""))
                .mapToInt(Integer:: parseInt)
                .sum();

        System.out.println("Sum: "+ sum);

    }
}
