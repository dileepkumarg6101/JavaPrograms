package InfosysInternalProjectPrep.streamApis;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
/*
🕒 When to use:

When you have nested collections and want a single stream of all elements.
 */
public class UsingFlatMap {
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(
                List.of(1,2,3),
                List.of(4,5,6),
                List.of(7,8,9)
        );

        // Flatten to single stream

        List<Integer> flatMAp = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(flatMAp);


    }
}
