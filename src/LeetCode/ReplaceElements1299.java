package LeetCode;

import java.util.Arrays;

public class ReplaceElements1299 {
    public static void main(String[] args) {

    int arr[]={17,18,5,4,6,1};
    int n= arr.length;
        int rightMax=-1;
    for (int i=n-1;i>=0;i-- ){
        int prev=arr[i];
        arr[i]=rightMax;
        rightMax=Math.max(rightMax,prev);
    }
        System.out.println(Arrays.toString(arr));

    }
}
