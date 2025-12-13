package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedArray {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map<String, Long> map = listOfStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Long maxCount = map.values().stream()
                .max(Long::compare)
                .orElse(null);

              List<String> result =   map.entrySet().stream()
                .filter( s -> s.getValue().equals(maxCount) )
                .map(Map.Entry::getKey)
                      .collect(Collectors.toList());
        System.out.println(map);

        System.out.println(result);

    }
}
