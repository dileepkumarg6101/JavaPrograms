package InfosysInternalProjectPrep.streamApis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("dileep","kumar","geethika");

        int length = names.stream()
                .collect(Collectors.mapping(String::length, Collectors.summingInt(Integer::intValue)));

        System.out.println(length);
    }
}
