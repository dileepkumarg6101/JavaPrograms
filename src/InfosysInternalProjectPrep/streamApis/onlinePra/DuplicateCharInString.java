package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*
26) Print duplicate characters in a string?
 */
public class DuplicateCharInString {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

        System.out.println(inputString);
        Set<String> uniqueElements = new HashSet<>();

        Set<String> result = Arrays.stream(inputString.split(""))
                .filter(i -> !uniqueElements.add(i))
                .collect(Collectors.toSet());

        System.out.println(result);
        System.out.println(uniqueElements);

    }
}
