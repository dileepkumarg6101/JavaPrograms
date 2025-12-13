package InfosysInternalProjectPrep.streamApis;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCalcEx3 {
    public static void main(String[] args) {

        List<String> sentence = Arrays.asList("Java", "is", "fun", "and", "Java", "is", "powerful");

//        List<String> names = Arrays.asList("Dileep");

        Map<String, Long> result = sentence.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(result);
    }
}
