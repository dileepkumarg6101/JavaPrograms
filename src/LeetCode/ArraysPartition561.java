package LeetCode;

import java.util.Arrays;

public class ArraysPartition561 {
    public static void main(String[] args) {
        int nums[]={1,4,3,2};
        Arrays.sort(nums); // 1,2,3,4
        int ans=0;
        for (int i=0;i<nums.length;i=i+2){
            ans+=nums[i];
        }
        System.out.println(ans);
    }
}
