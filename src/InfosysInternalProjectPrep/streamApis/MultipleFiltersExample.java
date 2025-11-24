package InfosysInternalProjectPrep.streamApis;

import java.util.List;
import java.util.stream.Collectors;
public class MultipleFiltersExample {
    public static void main(String[] args) {
        List<Integer> numners = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> filterEvenNumbers = numners.stream()
                .filter(n -> n > 2)
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList());
        System.out.println(filterEvenNumbers);
    }
}
