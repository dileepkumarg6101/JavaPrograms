package InfosysInternalProjectPrep.streamApis;

import java.util.List;
import java.util.stream.Collectors;

/*
3. Use  Stream.skip()  and  Stream.limit()  to extract  sublists.
 */
public class SkipAndLimitEx {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);

        List<Integer> sublist = numbers.stream()
                .skip(2)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(sublist);

    }
}
