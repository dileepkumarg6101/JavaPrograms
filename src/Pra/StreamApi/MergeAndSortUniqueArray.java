package Pra.StreamApi;

import java.util.Arrays;
import java.util.stream.IntStream;
/*
Merge two unsorted arrays into single sorted array without duplicate
 */
public class MergeAndSortUniqueArray {
    public static void main(String[] args) {
        int[] arr = {3,4,1,6,7,0};
        int [] arr2 = {8,4,3,9,5,1,6,7,2};

        IntStream.concat(Arrays.stream(arr), Arrays.stream(arr2))
                .sorted()
                .distinct()
                .forEach(i -> System.out.print(i+ ""));




    }
   





}
