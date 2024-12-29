package Dsa;
/*
Fixed size sliding window.
If it can only have 3 people what will be the maximum weight it will have.
arr=1,8,3,7,5,6
 */
public class FixedAndVariableSlidingWindow {
    public static void main(String[] args) {
        int arr[]={1,8,3,7,5,6};
        int n= arr.length;
        int sum=0;
        int l=0;
        int k=3;
        int temp=0;
        for (int r=0;r<n;r++){ // 1+8+3+7
            temp+=arr[r];       // r-l==k;
            if (r-l==k){
                temp-=arr[l];
                l++;
            }
            if (r-l+1==3){ //2-0+1==3
                sum=Math.max(temp,sum);

            }
        }
        System.out.println(sum);

    }
}
