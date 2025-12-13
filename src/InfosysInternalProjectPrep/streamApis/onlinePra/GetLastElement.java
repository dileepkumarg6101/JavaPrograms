package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.List;
/*
31) How do you get last element of an array?
 */
public class GetLastElement {
    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");

        String result =  listOfStrings.stream()
                .skip(listOfStrings.size()-1)
                .findFirst()
                .orElse(null);

        System.out.println(result);
    }
}
