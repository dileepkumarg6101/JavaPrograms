package InfosysInternalProjectPrep.streamApis;

import java.util.List;
import java.util.stream.Collectors;

/*
19. Check if all elements in a list are greater than a given number.
 */
public class AllMatchExample {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 15, 20, 25);

        boolean result = numbers.stream()
                .allMatch(n -> n > 5);

        System.out.println(result);


    }
}
