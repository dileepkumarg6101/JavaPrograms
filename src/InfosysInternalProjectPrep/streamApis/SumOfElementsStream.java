package InfosysInternalProjectPrep.streamApis;

import java.util.Arrays;
import java.util.List;

public class SumOfElementsStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        int sumOfNubers = list.stream()
                .mapToInt(Integer::intValue).sum();
        System.out.println(sumOfNubers);


    }


}
