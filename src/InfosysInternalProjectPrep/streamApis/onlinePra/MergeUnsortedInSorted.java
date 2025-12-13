package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?
 */
public class MergeUnsortedInSorted {
    public static void main(String[] args) {
//        int[] a = new int[]{4, 2, 7, 1};
//
//        int[] b = new int[]{8, 3, 9, 5};

        List<Integer> number1 = List.of(4, 2, 7, 1);
        List<Integer> number2 = List.of(8, 3, 9, 5);

        List<Integer> result = Arrays.asList(number1,number2).stream()
                .flatMap(List::stream)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
