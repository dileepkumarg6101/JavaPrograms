package InfosysInternalProjectPrep.InterviewPraPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElements {
    public static void main(String[] args) {
        //  1️⃣ Using Nested For Loops
        /*
        Integer array1[] = {1, 2, 3, 4, 5};
        Integer array2[] = {1, 2, 6, 7, 8};
        List<Integer> commonArray = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])){
                    if (!commonArray.contains(array1[i])){
                        commonArray.add(array1[i]);
                    }
                }
            }
        }
        System.out.println(commonArray.toString());

         */

        // -----------------------------
        // 2️⃣ Using retainAll() Method
        // -----------------------------
        /*

        Integer array1[] = {1,2,3,4,5};
        Integer array2[] = {6,7,8,9,1};
        List<Integer> arrayList1 = new ArrayList<>(Arrays.asList(array1));
        List<Integer> arrayList2 = new ArrayList<>(Arrays.asList(array2));
        arrayList1.retainAll(arrayList2);
        System.out.println(arrayList1);

         */

        // -----------------------------
        // 3️⃣ Using Java Streams
        // -----------------------------

        Integer array3[] = {1,2,3,4,5};
        Integer array4[] = {1,2,3,6,7};
        List<Integer> arrayList3 = new ArrayList<>(Arrays.asList(array3));
        List<Integer> arrayList4 = new ArrayList<>(Arrays.asList(array4));


        List<Integer> res = arrayList3.stream()
                .filter(arrayList4:: contains)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
