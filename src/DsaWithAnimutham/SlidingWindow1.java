package DsaWithAnimutham;
/*
variable slide sliding window.
You are given an array and you should find the maximum length of the subarray which has atmost k odd numbers
example:
[12,1,4,1,1,6,7,1,8,1]
k=2
Ans=4

 */
public class SlidingWindow1 {
    public static void main(String[] args) {
        int arr[]={12,1,4,1,1,6,7,1,8,1};
        int n= arr.length;
        int k=2;
        int ans=0;
        int l=0;
        int temp=0;
        for (int r=0;r<n;r++){
            if (arr[r]%2==1){
                temp+=1;
            }

        while (temp>k){
            if (arr[l]%2==1) {
                temp = temp - arr[l];
            }
            l++;

        }
       ans= Math.max(ans,r-1+1);
    }
        System.out.println(ans);
}
    }
