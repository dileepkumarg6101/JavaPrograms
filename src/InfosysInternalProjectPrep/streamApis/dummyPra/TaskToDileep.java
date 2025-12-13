package InfosysInternalProjectPrep.streamApis.dummyPra;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TaskToDileep {
    public static void main(String[] args) {

    String s = "Dileep";

/*
    String result = String.valueOf(Arrays.asList(s.split(""))
            .stream().limit(3).toList());
        System.out.println(result.toString());
        String result = String.valueOf(Arrays.asList(s.split(""))
            .stream().limit(3).toList());
        System.out.println(result.toString());
 */
        Arrays.asList(s)
                .stream().limit(3)
                        .forEach(System.out:: println);
    }
}
