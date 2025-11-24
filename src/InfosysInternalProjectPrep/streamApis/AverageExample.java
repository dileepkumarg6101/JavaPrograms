package InfosysInternalProjectPrep.streamApis;

import java.util.List;
import java.util.stream.Collectors;
/*
20. Find the average of a list of numbers.
 */
public class AverageExample {
    public static void main(String[] args) {
        /*
        List<Integer> averageValues = List.of(10,20,30,40,50);

        double number = averageValues.stream()
                .collect(Collectors.averagingDouble(n -> n));

        System.out.println(number);

         */

        List<Integer> averageValues = List.of(10,20,30,40,50);

        double result = averageValues.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println(result);

    }
}
