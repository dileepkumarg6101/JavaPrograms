package DsaWithStrivers.Step3_Problems_On_Arrays;

import java.util.Arrays;
/*
In this article we will learn how to solve the most asked coding interview problem: "Move all Zeros to the end of the array"

Problem Statement: You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their
 */
public class MoveZerosToEnd {
    /*
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = arr.length;
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);

            }
        }
        int nonZero = temp.size();
        for (int i = 0; i < nonZero; i++) {
            arr[i] = temp.get(i);
        }
        for (int i = nonZero; i < n; i++) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }

     */
    // approach 2.................
    /*
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = arr.length;
        int[] ans = moveZeros(arr, n);
        System.out.println(Arrays.toString(ans));
//        for (int i = 0; i < n; i++){
//            System.out.print(ans[i]+ ",");
//        }
    }

    public static int[] moveZeros(int[] arr, int n) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);

            }
        }
        int nonZero = temp.size();
        for (int i = 0; i < nonZero; i++) {
            arr[i] = temp.get(i);
        }
        for (int i = nonZero; i < n; i++) {
            arr[i] = 0;
        }

        return arr;
    }

     */
    /*

        public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = arr.length;
        int j = -1;
        for (int i = 0; i < n; i++){
            if (arr[i] == 0){
                j = i;
                break;
            }

        }

        for (int i = j+1; i < n; i++){
            if (arr[i]!= 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

     */
//    approach3:
    /*
    Optimal Approach(Using 2 pointers):
We can optimize the approach using 2 pointers i.e. i and j. The pointer j will point to the first 0 in the array and i will point to the next index.

Assume, the given array is {1, 0, 2, 3, 2, 0, 0, 4, 5, 1}. Now, initially, we will place the 2-pointers like the following:
     */
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = arr.length;
        int[] res = moveZero(arr, n);
        System.out.println(Arrays.toString(res));
    }

    public static int[] moveZero(int[] arr, int n) {
        int j = -1;
        //place the pointer j:
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }

        }
        // no non zero elements
        if (j == -1) return arr;
        //Move the pointers i and j
        //and swap accordingly:

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                //swap a[i] & a[j]:
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }

}




