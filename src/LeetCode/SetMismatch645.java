package LeetCode;
/*
Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]

step 1 : store the values
2: store the duplicates
3:fins the missing numner using index.
then display the both values storing in array.
 */

import java.util.Arrays;
import java.util.HashSet;

public class SetMismatch645 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        int[] number = {1, 2, 2, 4};
        int duplicate = 0;

        for (int i = 0; i < number.length; i++) {
            int val = number[i];
            if (!hashSet.contains(val)) {
                hashSet.add(val);
            } else {
                duplicate = val;
            }
        }
        System.out.println(duplicate);
        int missing = 0;
        for (int i = 1; i < number.length; i++) {
            if (!hashSet.contains(i)) {
                missing = i;
            }

        }
        System.out.println(missing);
        int[] arr = {duplicate, missing};
        System.out.println("Result: " + Arrays.toString(arr));

    }
}

































