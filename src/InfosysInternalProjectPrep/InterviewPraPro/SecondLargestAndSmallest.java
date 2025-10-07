package InfosysInternalProjectPrep.InterviewPraPro;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        // initilzating...
        Integer[] arraylist = {2, 4, 6, 1, 3, 7, 5};
        int size = arraylist.length;

        // sorted the above list of elements
        Arrays.sort(arraylist);

        // check the arraylist have min 2 elements:
        if (size < 2) {
            System.out.println("don not have enough elemnts");
            return;
        }

        // printing all the soreted elements....

        System.out.println(Arrays.toString(arraylist));

        // Second smallest = element at index 1

        System.out.println(arraylist[1]);

        // Second largest = element at index num-2
        System.out.println(arraylist[size-2]);

    }
}
