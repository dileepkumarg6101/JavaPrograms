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
public class WordCountUsingGroupingBy1 {
    public static void main(String[] args) {
        String a = "dileep";
//       char[] ch = a.toCharArray();

        Map<Character, Long> result = a.chars() // gives IntStream
                .mapToObj(c -> (char) c)  // convert each int to char
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result); // Output: {p=1, d=1, e=2, i=1, l=1}

    }
}
