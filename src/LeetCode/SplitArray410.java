package LeetCode;

/*
Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
 */
public class SplitArray410 {
    public static boolean isPossible(int[] nums, int k, int mid) {
        int temp = 0;
        k -= 1;
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (val > mid) {
                return false;
            }
            if (temp + val > mid) {
                k -= 1;
                temp = 0;
            }
            temp += val;
            if (k < 0) {
                return false;
            }
        }
        return true;
    }

    public static int splitArray(int[] nums, int k) {
        int l = 0;
        int r = (int) Math.pow(10, 9);
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(nums, k, mid)) {
                r = mid - 1;

            } else {
                l = mid + 1;
            }
        }
        return l;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        int result = splitArray(nums, k);
        System.out.println(result);

    }
}
