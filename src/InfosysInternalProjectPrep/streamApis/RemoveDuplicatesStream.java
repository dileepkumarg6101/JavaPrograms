package InfosysInternalProjectPrep.streamApis;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesStream {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 6, 6, 6,1,2,3,4);

        List<Integer> removeDupl = list.stream()
                .distinct()
                .toList();
        System.out.println(removeDupl);
    }


}
