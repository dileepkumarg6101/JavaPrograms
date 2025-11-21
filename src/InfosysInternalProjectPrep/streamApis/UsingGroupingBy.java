package InfosysInternalProjectPrep.streamApis;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
✅ Purpose:

Used to group elements by a classifier (like grouping students by department).

🕒 When to use:

When you want a Map<K, List<V>> structure — grouped by some property.
 */
public record UsingGroupingBy(String name, String dept) {

    public static void main(String[] args) {
        List<UsingGroupingBy> usingGroupingBy = List.of(
                new UsingGroupingBy("Dileep", "java"),
                new UsingGroupingBy("Kumar", "java"),
                new UsingGroupingBy("madhu", "python"),
                new UsingGroupingBy("Geethika", "tester")
        );

        Map<String, List<UsingGroupingBy>> results = usingGroupingBy.stream()
                .collect(Collectors.groupingBy(UsingGroupingBy::dept, Collectors.toList()));
        System.out.println(results);
    }

}
