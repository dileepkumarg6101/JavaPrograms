package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.List;
import java.util.stream.Collectors;

/*
problem: Find the square of the first three even numbers using java 8 stream..
 */
public class FindSquare {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 4, 5, 6, 8, 9);

        List<Integer> findingSquare = numbers.stream()
                .filter(n -> n % 2 == 0)
                .limit(3)
                .map(s -> s * s)
                .collect(Collectors.toList());

        System.out.println(findingSquare);


    }

}
