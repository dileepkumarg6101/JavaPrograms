package InfosysInternalProjectPrep.streamApis;

import java.util.List;

/*
26. Find the first element in a Stream greater than 10.
 */
public class SecondHighestNumberEx {
    public static void main(String[] args) {
        List<Integer> number = List.of(5, 10, 3, 5, 7, 15, 20);

        int result = number.stream()
                .filter(n -> n > 10)
                .findFirst()
                .orElse(-1);

        System.out.println(result);

    }
}
