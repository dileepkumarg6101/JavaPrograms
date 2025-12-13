package InfosysInternalProjectPrep.streamApis;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharExample {
    public static void main(String[] args) {

/*
 String input = "gdileepg";
        Character result = input.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
                .findFirst()
                .orElse(null);

        System.out.println(result);

 */
        /*
         String input = "gdileepg";
        Map<Character, Long> h = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));

        char c = h.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(c);
         */
        /*
        String input = "gdileepg";

        Map<Character, Long> result = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));

        char ch = result.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(ch);

         */
        /*

        String s = "swis";

        Character result = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                        .findFirst()
                                .orElse(null);
        System.out.println(result)

         */

        String s = "swis";

        Optional<Map.Entry<String, Long>> result = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() ==1)
                .findFirst();

        System.out.println(result.map(Map.Entry::getKey).get());




    }
}
