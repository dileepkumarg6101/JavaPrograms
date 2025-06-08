package Pra.StreamApi;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
Calculate the Sum and Average of all the elements of an array
 */
public class CalSumAndAvg {
    public static void main(String[] args) {
        int[] arr = {3,4,1,6,7,0};
        int [] arr2 = {8,4,3,9,5,1,6,7,2};

//        sum
        System.out.println("sum: " + Arrays.stream(arr).sum());

        // average
        System.out.println("average:" + Arrays.stream(arr).average());






    }
   





}
