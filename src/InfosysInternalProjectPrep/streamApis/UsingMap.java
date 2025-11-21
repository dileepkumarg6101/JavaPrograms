package InfosysInternalProjectPrep.streamApis;

import java.util.List;
import java.util.stream.Collectors;
/*
🕒 When to use:

Whenever you need to modify or convert elements (e.g., string to uppercase, object to field).
 */
public class UsingMap {
    public static void main(String[] args) {
        List<String> s = List.of("DIleep","DINESH","rajesh");

        List<String> map = s.stream()
                .map(String:: toLowerCase)
                .collect(Collectors.toList());

        System.out.println(map);
    }
}
