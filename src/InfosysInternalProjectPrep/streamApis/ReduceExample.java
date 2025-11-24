package InfosysInternalProjectPrep.streamApis;

import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {

    List<Integer> numbers = List.of(1,2,3);
    int result =  numbers.stream()
            .reduce(0, Integer::sum);

        System.out.println(result);
    }
}
