package InfosysInternalProjectPrep.streamApis;

import java.util.Comparator;
import java.util.List;

/*
27. Find the minimum value in a list using Streams.
 */
public class MinValueEx {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(200,5,10,20,100);
        /*

        int minValue = numbers.stream()
                .sorted(Comparator.naturalOrder())
                .findFirst()
                .orElse(-1);

        System.out.println(minValue);

         */
//        eg2
        int minValue = numbers.stream()
                        .min(Integer::compareTo)
                                .orElseThrow(() -> new RuntimeException("No min value found"));

        System.out.println(minValue);


    }
}
