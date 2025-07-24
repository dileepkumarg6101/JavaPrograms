package InterviewPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestAndSmallestStream {
    public static void main(String[] args) {
        // input array
        int[] array = {4, 2, 3, 1, 0, 6, 12, 15, 20, 20, 20};

        // Convert int[] to List<Integer> using boxed()
        List<Integer> list = Arrays.stream(array)
                .boxed()
                .distinct()  // remove duplicates (optional)
                .sorted()   // ascending order
                .collect(Collectors.toList());

        // Check size to avoid IndexOutOfBoundsException
        if (list.size() < 2) {
            System.out.println("array must have at least 2 distinct elements.");
            return;
        }

        // Display the full sorted list
        System.out.println(list);

        // Second smallest: element at index 1
        System.out.println("Second Smallest element is: " + list.get(1));

        // Second largest: element at index size - 2
        System.out.println("Second Largest element is: " + list.get(list.size() - 2));
    }

}
