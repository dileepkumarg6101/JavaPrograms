package InfosysInternalProjectPrep.streamApis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
24. Find the longest word in a list.

 */
public class WordCountExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("aaa", "bbbb", "ccccc");

        String result = names.stream()
                .max(Comparator.comparing(String::length))
                .orElse(null);
        System.out.println(result);


    }
}
