package InfosysInternalProjectPrep.streamApis;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
6. Find the second highest number in a list.
 */
public class SecondHighesNumber {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);

        Optional<Integer> number =  numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println(number);




    }
}
