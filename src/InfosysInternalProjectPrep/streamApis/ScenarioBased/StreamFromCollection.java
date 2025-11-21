package InfosysInternalProjectPrep.streamApis.ScenarioBased;

import java.util.List;
import java.util.stream.Stream;
/*
1️⃣ From Collections (List, Set, etc.)

✅ Example:

 */
public class StreamFromCollection {
    public static void main(String[] args) {
        // creation of list
        List<String> list = List.of("Dileep", "Kumar", "Dilkush");

        // call the stream without storing into var..
        list.stream()
                .forEach(System.out:: println);

        // call the stream with  storing into var..
        Stream<String> list1 = list.stream();

        list1.forEach(System.out:: println);

    }
}
/* output:
Dileep
Kumar
Dilkush
Dileep
Kumar
Dilkush
 */