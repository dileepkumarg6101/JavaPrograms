package LeetCode;

import java.util.Arrays;

public class MinAndMaxDiff1984 {
    public static void main(String[] args) {

//        int arr[]={9,4,1,7};
//        Arrays.sort(arr);
//        int k=3;
//        int ans=Integer.MAX_VALUE;
//        for (int i=0;i< arr.length-k+1;i++){
//            int j=i+k-1;
//           int temp=arr[j]-arr[i];
//           ans=Math.min(temp,ans);
//
//        }
//        System.out.println(ans);

//        step2
        int arr[] = {9, 4, 1, 7};
        Arrays.sort(arr);
        int k = 3;
        int ans = Integer.MAX_VALUE;
        int l = 0;
        for (int r = 0; r < arr.length; r++) {
            if (r - l == k) {
                l++;
            }
            if (r - l + 1 == k) {
                int temp = arr[r] - arr[l];
                ans = Math.min(temp, ans);
            }
        }
        System.out.println(ans);

    }


}
