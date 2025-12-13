package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.List;

public class MaxMinStreams {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

       int max =  numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
        System.out.println("Max: "+ max);

        int min =  numbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .getAsInt();

        System.out.println("Min: " + min);


    }
}
