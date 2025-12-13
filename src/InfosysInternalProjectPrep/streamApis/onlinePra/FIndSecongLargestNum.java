package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Comparator;
import java.util.List;

public class FIndSecongLargestNum {
    public static void main(String[] args) {


        List<Integer> numbers = List.of(1, 10, 2, 30, 100, 200, 300);

        int result = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(result);

    }
}
