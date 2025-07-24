package InterviewPrograms;

import java.util.Arrays;

public class SecondLargestAndSmallest {
    public static void main(String[] args) {

        // Example input array
        Integer[] arrayList = {4, 2, 3, 1, 0, 6, 12, 15,    20};

        // get the number of the elements in the array...
        int num = arrayList.length;

        // Check if array has at least 2 elements

        if (num < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }
        // Sort the array in ascending order
        Arrays.sort(arrayList); // Now arrayList = [0, 1, 2, 3, 4, 6, 12, 15, 20]

        // Print the full sorted array (for understanding)

        System.out.println(Arrays.toString(arrayList));

        // Second smallest = element at index 1

        System.out.println("Second Smallest element is: " + arrayList[1]);

        // Second largest = element at index num-2
        System.out.println("Second Largest element is: " + arrayList[num-2]);

    }
}
