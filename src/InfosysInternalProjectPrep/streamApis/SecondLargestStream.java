package InfosysInternalProjectPrep.streamApis;

import java.util.Comparator;
import java.util.List;

public class SecondLargestStream {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int secondLargest = list.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst().get();
        System.out.println(secondLargest);
    }
}
