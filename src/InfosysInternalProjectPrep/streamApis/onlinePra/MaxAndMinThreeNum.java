package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
11) How do you get three maximum numbers and three minimum numbers from the given list of integers?
 */
public class MaxAndMinThreeNum {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        List<Integer> max = listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("max: " + max);

        List<Integer> min = listOfIntegers.stream()
                .sorted()
                .distinct()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("max: " + min);


    }
}
