package InfosysInternalProjectPrep.streamApis;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("dileep","kumar","geethika");

        List<Integer> length = names.stream()
                .collect(Collectors.mapping(String::length, Collectors.toList()));

        System.out.println(length);
    }
}
