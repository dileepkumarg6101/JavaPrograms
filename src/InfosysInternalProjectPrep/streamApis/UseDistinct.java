package InfosysInternalProjectPrep.streamApis;

import java.util.List;
import java.util.stream.Collectors;
/*
🕒 When to use:

Whenever you need only unique elements.
 */
public class UseDistinct {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,4,4,5,6,6,6);

        List<Integer> unq = nums.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(unq);
    }
}
