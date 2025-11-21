package InfosysInternalProjectPrep.streamApis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Sort in Reverse Order
 */
public class SortDescendingStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> sortingDecending =  list.stream()
                        .sorted(Comparator.reverseOrder())
                                .toList();

        System.out.println(sortingDecending);
    }
}
