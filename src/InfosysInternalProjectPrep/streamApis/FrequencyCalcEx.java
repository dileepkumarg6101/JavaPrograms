package InfosysInternalProjectPrep.streamApis;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCalcEx {
    public static void main(String[] args) {

        String s = "dileep";

//        List<String> names = Arrays.asList("Dileep");

        Map<Character, Long> result = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(result);
    }
}
