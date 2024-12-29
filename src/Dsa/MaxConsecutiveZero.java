package Dsa;

public class MaxConsecutiveZero {
    public static void main(String[] args) {

        int arr[] = {1, 0, 1, 1, 0};
        int n = arr.length;
        int l = 0;
        int ans = 0;
        int k=1;
        int cnt1=0;
        int cnt0=0;
        for (int r=0;r<n;r++){
            if (arr[r]==0){
                cnt0++;
            }
            else {
                cnt1++;
            }
            while (Math.min(cnt0,cnt1)>k){
                if (arr[l]==0){
                    cnt0--;
                }
                else {
                    cnt1--;
                }
                l++;
            }
           ans= Math.max(ans,r-l+1);
        }
        System.out.println(ans);
    }
}
