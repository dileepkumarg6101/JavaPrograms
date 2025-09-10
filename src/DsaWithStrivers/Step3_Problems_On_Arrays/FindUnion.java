package DsaWithStrivers.Step3_Problems_On_Arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Union of Two Sorted Arrays

Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.

The union of two arrays can be defined as the common and distinct elements in the two arrays.NOTE: Elements in the union should be in ascending order.
 */
public class FindUnion {
    /*
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        Set<Integer> unionSet = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            unionSet.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            unionSet.add(arr2[i]);
        }
//        System.out.println(unionSet);

        List<Integer> unionList = new ArrayList<>(unionSet);
        Collections.sort(unionList);
//        System.out.println(unionList);

        for (int res : unionList) {
            System.out.print(res + " ");

        }
    }

     */
//    using Java 8+ Stream API
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};


        List<Integer> unionList = Stream.concat(
                Arrays.stream(arr1).boxed(),
                Arrays.stream(arr2).boxed())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        unionList.forEach(num -> System.out.print(num+ " "));

    }


}
