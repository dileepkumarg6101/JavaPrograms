package InfosysInternalProjectPrep.streamApis;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Write a Java program to count the occurrences of each word in a list using the
 groupingBy() and counting() collectors in the Stream API.
// Output:
 */
public class WordCountUsingGroupingBy1 {
    public static void main(String[] args) {
        String s  = "dileep";

        Map<Character, Long> result = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(result);
    }

}
