package InfosysInternalProjectPrep.streamApis;

import java.util.List;
import java.util.stream.Collectors;

/*
Q4. Write a Java program to convert all strings in a list to uppercase
 using Streams and the map() method.
 */
public class ConvertStringsToUppercase {
    public static void main(String[] args) {
        List<String> names = List.of("dileep","dilkush", "kumar");
        List<String> result =  names.stream()
                .map(String:: toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);


    }
}
