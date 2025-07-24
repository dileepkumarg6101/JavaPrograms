package DsaWithStrivers.Step3_Problems_On_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 9, 9, 9, 8};

        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        int secondSmallest = list.get(1);
        System.out.println("secondSmallest: " + secondSmallest);

        int secondLargest = list.get(list.size() - 2);
        System.out.println("secondLargest: " + secondLargest);
    }
}
