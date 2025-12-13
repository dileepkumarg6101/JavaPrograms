package InfosysInternalProjectPrep.streamApis;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyCalcEx2 {
    public static void main(String[] args) {

        String sentence = "Java is fun and Java is powerful";

//        List<String> names = Arrays.asList("Dileep");

        Map<String, Long> result = Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(result);
    }
}
