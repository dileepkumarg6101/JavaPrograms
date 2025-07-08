package DsaWithAnimutham;
/*
Variable size sliding window.
you are given an array and you should find the maximum length of the subarray which  has atmost k ones
example:[0,1,3,1,1,6,7,1,0,1] k=2
Ans=5
 */

public class VariableSizeSldingWindow {
    public static void main(String[] args) {

        int arr[]={0,1,3,1,1,6,7,1,0,1};
        int n=arr.length;
        int ans=0;
        int l=0;
        int temp=0; // 2
        int k=2;
        int count=1;
        for (int r=0;r<n;r++){
            if (arr[r]==1){
                temp++; // 0,1,3,1,1 =3
            }
            while(temp>k){
                if (arr[l]==1){
                    temp--;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        System.out.println(ans);


    }
}
