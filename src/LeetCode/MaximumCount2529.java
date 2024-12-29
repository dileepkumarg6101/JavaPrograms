package LeetCode;
/*
Input: nums = [-2,-1,-1,1,2,3]
Output: 3
Explanation: There are 3 positive integers and 3 negative integers.
The maximum count among them is 3.
 */
public class MaximumCount2529 {
    public static int LeftMost(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
    public static void main(String[] args) {

//        int[] nums = {-2, -1, -1, 1, 2, 3};
        int[] nums = {5,20,66,1314};
        int neg=LeftMost(nums,0);
        int one=LeftMost(nums,1);
        int pos=nums.length-one;
        int res= Math.max(neg,pos);
        System.out.println(res);
    }
}