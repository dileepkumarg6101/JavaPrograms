package InfosysInternalProjectPrep.streamApis;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
4. Use  Collectors.teeing()  to compute two operations  on a Stream.
 */
public class TeeingEx {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);

        Map<String, Double> teeingOp = numbers.stream()
                .collect(Collectors.teeing(
                        Collectors.summingDouble(n -> n),
                        Collectors.averagingDouble(n -> n),
                        (sum, avg) -> Map.of("sum", sum,"Average", avg)
                ));

        System.out.println(teeingOp);
    }
}
