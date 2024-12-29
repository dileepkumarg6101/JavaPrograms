package Collections;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {5, 8, 9, 4, 2, 7};
        int n = arr.length;
        Arrays.sort(arr);
//        for (int i = 0; i < n - 1; i++) {
//            boolean swap=false;
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swap=true;
//                }
//            }
//            if (swap==false){
//                break;
//            }
//        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
