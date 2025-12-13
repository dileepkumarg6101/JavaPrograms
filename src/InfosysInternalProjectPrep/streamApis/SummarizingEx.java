package InfosysInternalProjectPrep.streamApis;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingEx {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        IntSummaryStatistics sumarizing = numbers.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(sumarizing);
    }
}
