package InfosysInternalProjectPrep.streamApis;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectingAndThenEx {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("apple", "banana", "banana", "carrot");

        int collectingTheSize = names.stream()
                .collect(Collectors.collectingAndThen(Collectors.toSet(), Set::size));

        System.out.println(collectingTheSize);

    }
}
