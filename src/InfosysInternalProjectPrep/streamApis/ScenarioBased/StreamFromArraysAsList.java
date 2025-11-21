package InfosysInternalProjectPrep.streamApis.ScenarioBased;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFromArraysAsList {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana","chilaka"};
        // Convert array to list, then stream
        /*

        Arrays.asList(arr).stream()
                .map(String:: toUpperCase)
                .forEach(System.out:: println);

         */
        // Convert array to list, then stream

        Stream<String> list1 = Arrays.asList(arr).stream();

        list1.map(String:: toUpperCase)
                .forEach(System.out:: println);
    }
}
/*
APPLE
BANANA
CHILAKA
 */