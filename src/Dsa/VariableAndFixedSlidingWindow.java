package Dsa;
/*
Variable size sliding window.
If it can accomated 10 kg max weight , what is maximum number of people it can have.
arr=1,8,3,7,5,6
 */
public class VariableAndFixedSlidingWindow {
    public static void main(String[] args) {
        int arr[]={1,5,3,2,9};
        int n= arr.length;
        int ans=0;
        int l=0;
        int temp=0;
        int w=10;
        for (int r=0;r<n;r++){
            temp+=arr[r];

            while(temp>w){
                temp-=arr[l];
                l++;
            }
            ans=Math.max(ans,r-l+1);
//            System.out.println(ans);
        }
        System.out.println(ans);

    }
}
