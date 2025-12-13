package InfosysInternalProjectPrep.streamApis;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMapEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("dileep", "kumar", "geethika");


        Map<String, Integer> toMapString = names.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));

        System.out.println(toMapString);

    }
}
