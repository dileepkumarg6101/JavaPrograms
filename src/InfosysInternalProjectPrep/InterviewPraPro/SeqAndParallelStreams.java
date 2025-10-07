package InfosysInternalProjectPrep.InterviewPraPro;

import java.util.Arrays;
import java.util.List;

public class SeqAndParallelStreams {
    public static void main(String[] args) {
        /*

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        numbers.stream()
                .forEach(System.out::println);

         */

        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7);
        number.parallelStream()
                .forEach(System.out::println);



    }
}
