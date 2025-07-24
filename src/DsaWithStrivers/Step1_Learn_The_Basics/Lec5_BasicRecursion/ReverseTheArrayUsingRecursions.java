package DsaWithStrivers.Step1_Learn_The_Basics.Lec5_BasicRecursion;

import static java.util.Collections.swap;

public class ReverseTheArrayUsingRecursions {
    static void f(int i, int[] arr, int n) {
        if (i >= n / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        f(i+1, arr,n);
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4,5,6};
        int n = arr.length;
        f(0, arr, n);

        for (int num : arr){
            System.out.print(num+",");
        }
    }

}

