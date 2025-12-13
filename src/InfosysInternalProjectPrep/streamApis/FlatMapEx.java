package InfosysInternalProjectPrep.streamApis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx {
    public static void main(String[] args) {
        List<List<String>> names = Arrays.asList(
                Arrays.asList("Dileep", "Kumar", "G"),
                Arrays.asList("Geethika", "Janagama", "Reddy")
        );

        List<String> result = names.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
