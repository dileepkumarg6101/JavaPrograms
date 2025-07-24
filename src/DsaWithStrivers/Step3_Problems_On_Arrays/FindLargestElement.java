package DsaWithStrivers.Step3_Problems_On_Arrays;
import java.util.Arrays;
public class FindLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,5};
        Arrays.sort(arr);
        int size = arr.length;
//      printing the sorted arrays
        System.out.println(Arrays.toString(arr));
        // printing the largest element in the array...
        System.out.println(arr[size-1]);
    }
}