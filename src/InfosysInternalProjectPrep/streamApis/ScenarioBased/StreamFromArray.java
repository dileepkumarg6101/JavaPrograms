package InfosysInternalProjectPrep.streamApis.ScenarioBased;

import java.util.Arrays;
import java.util.stream.Stream;

/*
2️⃣ From Arrays using Arrays.stream()

✅ Example:
 */
public class StreamFromArray {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};

        // Creating Stream from Array

        Stream<String> list1 = Arrays.stream(arr);

        list1.forEach(System.out:: println);

    }
}
/*
✅ Output:

a
b
c
 */
