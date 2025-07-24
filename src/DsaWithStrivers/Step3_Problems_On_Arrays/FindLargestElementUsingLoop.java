package DsaWithStrivers.Step3_Problems_On_Arrays;

import java.util.Arrays;

public class FindLargestElementUsingLoop {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 5};
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("largest element is: " + largest);

    }
}