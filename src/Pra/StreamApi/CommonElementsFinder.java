package Pra.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
Find out common elements between two arrays
 */
public class CommonElementsFinder {
    public static void main(String[] args) {

        int[] arr1 = { 3, 4, 1, 6, 7, 0 };
        int[] arr2 = { 8, 4, 3, 9, 5, 1, 6, 7, 2 };

        List<Integer> tempList = new ArrayList<>();
        for (int i : arr2) tempList.add(i);

        Arrays.stream(arr1)
                .filter(tempList:: contains)
                .forEach(i -> System.out.print(i + " "));


    }
}
