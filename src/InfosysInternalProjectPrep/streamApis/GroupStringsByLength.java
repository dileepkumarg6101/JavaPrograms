package InfosysInternalProjectPrep.streamApis;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Write a Java program to group strings by their length
using the groupingBy() collector in the Stream API.
 */
public class GroupStringsByLength {
    public static void main(String[] args) {
        List<String> names = List.of("dileep", "chaitanya", "bosideke");
        Map<Integer, List<String>> results = names.stream()
                .collect(Collectors.groupingBy(String::length,
                        Collectors.mapping(name -> name, Collectors.toList())

                ));


        System.out.println(results);

    }
}
