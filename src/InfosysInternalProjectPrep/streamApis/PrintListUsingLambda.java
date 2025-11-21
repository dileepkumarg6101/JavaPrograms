package InfosysInternalProjectPrep.streamApis;

import java.util.List;
import java.util.stream.Collectors;
/*
Q1. Write a Java program to print all elements of a list using a Lambda Expression and the forEach()
 method of the Stream API.
 */
public class PrintListUsingLambda {
    public static void main(String[] args) {

        List<String> names = List.of("Aunty", "Bamardi", "chunchu");

        List<String> results = names.stream()
                .collect(Collectors.toList());

        System.out.println(results);
    }
}
