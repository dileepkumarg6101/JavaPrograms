package InfosysInternalProjectPrep.streamApis;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
13) Find sum of all digits of a number in Java 8?
 */
public class SumOfAllDigits {

    public static void main(String[] args) {
        int number = 12345;

        int result = String.valueOf(number).chars()
                .map(Character::getNumericValue)
                .sum();
        System.out.println(result);
    }
}
