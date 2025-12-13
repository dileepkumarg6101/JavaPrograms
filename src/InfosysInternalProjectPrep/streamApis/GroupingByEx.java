package InfosysInternalProjectPrep.streamApis;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
// filtering eg at end

public class GroupingByEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("dileep", "kumar", "geethika", "dinesh");

        Map<Integer, Long> groupingByEx = names.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        System.out.println(groupingByEx);
     }
}
