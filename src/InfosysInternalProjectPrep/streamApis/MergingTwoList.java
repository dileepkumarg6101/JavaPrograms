package InfosysInternalProjectPrep.streamApis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 Merge two lists into a single list using  flatMap()
 */
public class MergingTwoList {
    List<Integer> number1 = Arrays.asList(1,2,3);
    List<Integer> number2 = Arrays.asList(4,5,6);

    List<Integer> result = Stream.of(number1,number2)
            .flatMap(List:: stream)
            .collect(Collectors.toList());


}
