package DsaWithAnimutham;

import java.util.Arrays;

/*
Input: nums = [9,4,1,7], k = 2
Output: 2
length=4;
1.Loop compare with two values
2. store the j value;
3. subract the j-i;
4. find out the max value;

4-2+1=3;
sort=1,4,7,9

 */
public class MinimumDifferenceBetweenHighestAndLowestScores {
    public static void main(String[] args) {
        int nums[]={9,4,1,7};
        int k=2;
        Arrays.sort(nums);
        int res=Integer.MAX_VALUE;
        for (int i=0;i< nums.length-k+1;i++){
            int j=i+k-1;
            System.out.println(i+" "+j);
            int temp=nums[j]-nums[i];
            res=Math.min(temp,res);

        }
        System.out.println(res);


    }
}
