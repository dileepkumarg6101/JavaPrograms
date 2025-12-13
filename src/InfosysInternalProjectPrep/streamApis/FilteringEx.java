package InfosysInternalProjectPrep.streamApis;

import java.util.List;
import java.util.stream.Collectors;

public class FilteringEx {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 8, 9, 10);

        List<Integer> filteringNumbers = numbers.stream()
                .collect(Collectors.filtering(f -> f % 2 == 0, Collectors.toList()));

        System.out.println(filteringNumbers);

    }
}
