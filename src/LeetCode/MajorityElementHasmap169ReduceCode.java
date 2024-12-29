package LeetCode;

import java.util.Arrays;

public class MajorityElementHasmap169ReduceCode {
    public static void main(String[] args) {
        int[] nums = {3,2,3,2,2};
        Arrays.sort(nums);
        int n= nums.length/2;
        System.out.println(nums[n]);
    }
}
