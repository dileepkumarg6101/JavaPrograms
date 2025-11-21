package InfosysInternalProjectPrep.streamApis;

import java.util.List;
import java.util.stream.Collectors;

/*
🕒 When to use:

When you need ascending/descending order sorting.
 */
public class UseSorted {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,9,8,7,6);
        /*

        List<Integer> sorted = nums.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);

         */

        nums.stream()
                .sorted()
                .forEach(System.out::println);
    }

}
