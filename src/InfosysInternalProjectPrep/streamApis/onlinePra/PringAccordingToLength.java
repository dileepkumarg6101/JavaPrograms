package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
5) Given a list of strings, sort them according to increasing order of their length?
 */
public class PringAccordingToLength {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

       List<String> result = listOfStrings.stream()
                        .sorted(Comparator.comparing(String::length))
               .collect(Collectors.toList());
        System.out.println(result);
    }
}
