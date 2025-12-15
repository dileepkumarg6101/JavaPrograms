package InfosysInternalProjectPrep.streamApis.codingWithVignesh;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("dileep", "madhu", "dileep", "govardan");

       List<String> removingDuplicates =  names.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(removingDuplicates);
    }
}
