package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
25) How do you extract duplicate elements from an array?
 */
public class DuplicateElementsFinding {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);

        Set<Integer> duplicateNumbers = listOfIntegers.stream()
                .filter(n -> Collections.frequency(listOfIntegers, n) > 1)
                .collect(Collectors.toSet());

        System.out.println(duplicateNumbers);

    }
}
