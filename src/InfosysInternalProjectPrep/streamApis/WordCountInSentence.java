package InfosysInternalProjectPrep.streamApis;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountInSentence {
    public static void main(String[] args) {
        /*

        String sentence = "Java is fun and Java is powerful";

        Map<Character, Long>  result = sentence.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(result);

         */
        String sentence = "Java is fun and Java is powerful";

        Map<String, Long> result = Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap:: new, Collectors.counting()));

        System.out.println(result);







    }
}
