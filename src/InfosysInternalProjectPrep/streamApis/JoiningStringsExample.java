package InfosysInternalProjectPrep.streamApis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningStringsExample {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Dileep", "Kumar", "G");
        String result =  name.stream()
                .collect(Collectors.joining());
        System.out.println(result);
    }
}


