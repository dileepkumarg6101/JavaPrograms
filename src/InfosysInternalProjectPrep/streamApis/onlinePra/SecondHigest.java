package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
14) Find second largest number in an integer array?
 */
public class SecondHigest {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int secondHighest = listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondHighest);
    }

}
