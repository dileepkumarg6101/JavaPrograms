package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWord {
    public static void main(String[] args) {
        String word = "Hello java macha";


        String result = Arrays.stream(word.split(" "))
                .map(rev -> new StringBuilder(rev).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(result);

    }
}
