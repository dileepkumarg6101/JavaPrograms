package InfosysInternalProjectPrep.streamApis;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
🪄 Simple Definition of mapping()

mapping() is used inside groupingBy() when you want to pick only a specific field from each object in a group instead of keeping the whole object.

💡 In other words:

👉 groupingBy() = groups data
👉 mapping() = tells what to keep from each group

📘 Easy way to remember:

groupingBy() says “Group by this field.”
mapping() says “But only keep this data inside each group.”
 */
public record UsingMapping(String name, String dept) {

    public static void main(String[] args) {

        List<UsingMapping> usingMappings = List.of(
                new UsingMapping("Dileep", "Java"),
                new UsingMapping("Kumar", "Java"),
                new UsingMapping("madhu", "Python"),
                new UsingMapping("Geethika", "Tester")
        );

        Map<String, List<String>> results = usingMappings.stream()
                .collect(Collectors.groupingBy(
                        UsingMapping::dept,
                        Collectors.mapping(UsingMapping::name,
                                Collectors.toList())
                ));

        System.out.println(results);


    }

}
