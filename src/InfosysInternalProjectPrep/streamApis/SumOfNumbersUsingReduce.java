package InfosysInternalProjectPrep.streamApis;

import java.util.List;

/*
Write a Java program to find the sum of all numbers in a list using the reduce() method in the Stream API.
 */
public class SumOfNumbersUsingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int results = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(results);
    }
}
