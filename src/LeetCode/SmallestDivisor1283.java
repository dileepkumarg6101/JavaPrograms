package LeetCode;
/*
Example 1:
Input: nums = [1,2,5,9], threshold = 6
Output: 5
Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1.
If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2).
Example 2:
Input: nums = [44,22,33,11,1], threshold = 5
Output: 44
 */
public class SmallestDivisor1283 {
    //     Helper method to check if a given divisor k satisfies the condition
    public static boolean isPossible(int[] nums, int threshold, int k) {
        for (int i = 0; i < nums.length; i++) {
            int upper = nums[i] / k;
            if (nums[i] % k != 0) {
                upper++;
            }
            threshold -= upper;
            if (threshold <= 0) {
                return false;
            }
        }
        return true;
    }
    // Main method to find the smallest divisor
    public static int smallestDivisor(int[] nums, int threshold) {
        int l = 1;
        int r = 1000000;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(nums, threshold, mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;

    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 5, 9};
        int threshold1 = 6;
        int result1 = smallestDivisor(nums1, threshold1);
        System.out.println(result1);
    }
}

