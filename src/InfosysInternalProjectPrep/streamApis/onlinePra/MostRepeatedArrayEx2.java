package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
/*
22) How do you find the most repeated element in an array?
 */
public class MostRepeatedArrayEx2 {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map<String, Long> map = listOfStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map.Entry<String, Long> repeatedArray = map.entrySet().stream()
                        .max(Map.Entry.comparingByValue()).get();


        System.out.println("Most Frequent Element : "+repeatedArray.getKey());

        System.out.println("Count : "+repeatedArray.getValue());

    }
}
