package InfosysInternalProjectPrep.InterviewPraPro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestAndSmallestStream {
    public static void main(String[] args) {
        int[] arrayList = {4, 1, 2, 3, 5, 7, 8, 6};

        List<Integer> list = Arrays.stream(arrayList)
                .boxed()
                .distinct()
                .sorted()
                .collect(Collectors.toList());


        //  check the list have min 2 elements...
        if (list.size() < 2) {
            System.out.println("do not have min elements");
            return;
        }
        System.out.println(list);

        System.out.println(list.get(1));
        System.out.println(list.get(list.size()-2));

    }
}
