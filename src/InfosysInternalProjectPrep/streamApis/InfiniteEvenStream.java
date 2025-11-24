package InfosysInternalProjectPrep.streamApis;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
18. Generate an infinite Stream of even numbers and limit it to 10 elements.
 */
public class InfiniteEvenStream {

    public static void main(String[] args) {
        List<Integer> numbers = Stream.iterate(0, n -> n + 2)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(numbers);

    }
}
