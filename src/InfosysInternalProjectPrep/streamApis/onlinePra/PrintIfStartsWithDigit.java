package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.List;

/*
24) Given a list of strings, find out those strings which start with a number?
 */
public class PrintIfStartsWithDigit {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");

        listOfStrings.stream()
                .filter(str -> Character.isDigit(str.charAt(0)))
                .forEach(System.out::println);

    }
}
