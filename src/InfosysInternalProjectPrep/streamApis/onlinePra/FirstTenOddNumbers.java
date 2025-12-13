package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
30) First 10 odd numbers
 */
public class FirstTenOddNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Stream.iterate(1, n -> n + 2)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(numbers);

    }
}
