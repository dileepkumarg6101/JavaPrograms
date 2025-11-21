package InfosysInternalProjectPrep.streamApis;

import java.util.Arrays;
import java.util.List;

public class OddEvenNumbersStreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<Integer> evenNumbers = list.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("evenNumbers: " + evenNumbers);

        List<Integer> oddNumbers = list.stream()
                .filter(n -> n % 2!= 0)
                .toList();
        System.out.println("oddNumbers: "+ oddNumbers);



    }
}
