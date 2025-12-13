package InfosysInternalProjectPrep.streamApis;

import java.util.List;
import java.util.stream.Collectors;

public class ReducingEx {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int reducingNumner = numbers.stream()
                .collect(Collectors.reducing(0, Integer::sum));


        System.out.println(reducingNumner);

    }
}
