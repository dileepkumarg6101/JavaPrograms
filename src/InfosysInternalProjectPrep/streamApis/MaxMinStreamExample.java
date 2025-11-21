package InfosysInternalProjectPrep.streamApis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinStreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        int max = list.stream()
                .max(Integer::compareTo).get();
        System.out.println(max);

        int min  = list.stream()
                .min(Integer::compareTo).get();

        System.out.println(min);

    }

}
