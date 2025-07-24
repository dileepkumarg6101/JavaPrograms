package DsaWithStrivers.Step3_Problems_On_Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        /*
        int[] arr = {1, 5, 1, 2, 3, 4, 1, 2, 3, 4};

        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list);

         */

        // using hasset to remove duplicate....
        int[] arr = {1, 5, 6, 1, 2, 3, 4, 1, 2, 3, 4};
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }

        for (int res: hashSet){
            System.out.print(res+",");
        }
    }
}
