package InfosysInternalProjectPrep.streamApis;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Write a Java program to count the occurrences of each word in a list using the
 groupingBy() and counting() collectors in the Stream API.
// Output: {apple=2, banana=1}
 */
public class WordCountUsingGroupingBy {
    public static void main(String[] args) {
        List<String> names  = Arrays.asList("Apple", "Apple", "Bonda","Bajji");

        Map<String, Long> result =  names.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(result);

    }
}
