package InfosysInternalProjectPrep.streamApis.dummyPra;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class COnvertUppercaseRemDup {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "ant","ball","Cat", "apple");

        List<String> convertUpperCase = names.stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(convertUpperCase);
    }
}
