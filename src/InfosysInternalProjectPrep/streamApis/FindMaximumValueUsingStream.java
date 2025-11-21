package InfosysInternalProjectPrep.streamApis;

import java.util.Comparator;
import java.util.List;

public class FindMaximumValueUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40);

        int num = numbers.stream()
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println(num);
    }
}
