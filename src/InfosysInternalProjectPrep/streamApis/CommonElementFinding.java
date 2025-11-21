package InfosysInternalProjectPrep.streamApis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
4. Question: How do you find common elements between two lists of integers using the Stream API?
 */
public class CommonElementFinding {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 6, 7);

        List<Integer> commonElement = list1.stream()
                .filter(list2::contains)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(commonElement);

    }
}
