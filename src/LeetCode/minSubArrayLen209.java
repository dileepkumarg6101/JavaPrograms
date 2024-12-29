package LeetCode;
/*
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 */

public class minSubArrayLen209 {
    public static void main(String[] args) {

        int nums[] = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int l = 0;
        int ans = Integer.MAX_VALUE;
        int temp = 0;
        int n = nums.length;
        for (int r = 0; r < n; r++) {
            temp += nums[r];
            while (temp >= target) {
                ans = Math.min(ans, r - l + 1);
                temp -= nums[l];
                l++;
            }
        }
        if (ans == Integer.MAX_VALUE) {
            System.out.println(" 0");
        } else {
            System.out.println(ans);
        }

    }
}
