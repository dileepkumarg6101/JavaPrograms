package InfosysInternalProjectPrep.streamApis;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
28. Use  Stream.generate()  to create a list of random  numbers.
 */
public class RandomNumbersEx {
    public static void main(String[] args) {
        /*


        List<Integer> numbers = Stream.iterate(1, n -> n + 2)
                .limit(5)
                .toList();
        System.out.println(numbers);

         */
//        using generator....

        List<Double> ramdomNumbers = Stream.generate(Math::random)
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(ramdomNumbers);
    }
}


