package InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElements {
    public static void main(String[] args) {
        /*
        //  1️⃣ Using Nested For Loops

        Integer[] array1 = {4, 2, 3, 1, 6};
        Integer[] array2 = {6, 7, 8, 4};

        List<Integer> commonElement = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])){
                    if (!commonElement.contains(array1[i])){  // to avoid duplicates
                        commonElement.add(array1[i]);
                    }
                }
            }
        }
        System.out.println("Common Elements using for-loop: "+ commonElement.toString());

         */
        /*
        // -----------------------------
        // 2️⃣ Using retainAll() Method
        // -----------------------------

        Integer[] array1 = {4, 2, 3, 1, 6};
        Integer[] array2 = {6, 7, 8, 4};

        List<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
        list1.retainAll(list2);
        System.out.println("Common Elements using retainAll(): " +list1);

         */
        // -----------------------------
        // 3️⃣ Using Java Streams
        // -----------------------------
        String[] array3 = {"Java", "JavaScript", "C", "C++"};
        String[] array4 = {"Python", "C#", "Java", "C++"};

        List<String> list3 = new ArrayList<>(Arrays.asList(array3));
        List<String> list4 = new ArrayList<>(Arrays.asList(array4));

        List<String> commonElements = list3.stream()
                .filter(list4:: contains)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Common Elements using Java Stream: " + commonElements);
    }

}
