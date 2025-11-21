package InfosysInternalProjectPrep.streamApis;

import java.util.List;
import java.util.stream.Collectors;
/*
🕒 When to use:

Whenever you need to remove unwanted elements from a stream.
 */
public class UsingFilter {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);

        List<Integer> filter = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(filter);
    }
}
