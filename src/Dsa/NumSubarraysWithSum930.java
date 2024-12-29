package Dsa;

/*
Example 1:

Input: nums = [1,0,1,0,1], goal = 2
Output: 4
Explanation: The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
 */
public class NumSubarraysWithSum930 {

    // Helper method to calculate subarrays with a sum of at most k
    public static int atMostK(int[] nums, int k) {
        if (k < 0)
            return 0; // No valid subarray if k is negative
        int l = 0;
        int ans = 0;
        int temp = 0;
        int n = nums.length;
        for (int r = 0; r < n; r++) {
            temp += nums[r]; // Add the current number to the running sum
            // Shrink the window until the sum is <= k
            while (temp > k) {
                temp -= nums[l];
                l++;
            }
            // Add the number of subarrays ending at index r
            ans += r - l + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;
        int result = atMostK(nums, goal) - atMostK(nums, goal - 1);
        System.out.println("Number of subarrays with sum " + goal + ": " + result);
    }
}
