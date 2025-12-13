package InfosysInternalProjectPrep.streamApis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningEx {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("dileep", "kumar", "geethika");

        String useJoining = names.stream()
                .collect(Collectors.joining(",", "[","]" ));

        System.out.println(useJoining);





    }
}
