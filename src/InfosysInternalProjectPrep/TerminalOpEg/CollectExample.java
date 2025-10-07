package InfosysInternalProjectPrep.TerminalOpEg;

import java.util.List;
import java.util.stream.Collectors;
/*
2. collect()

Collects the stream elements into a collection or other data structure.
 */
public class CollectExample {
    public static void main(String[] args) {
        List<String> names  = List.of("Akila", "Dileep", "Anandh");
        List<String> filterName = names.stream()
                .filter(e -> e.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(filterName);

    }
}
