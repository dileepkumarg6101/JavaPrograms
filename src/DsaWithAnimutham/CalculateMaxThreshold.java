package DsaWithAnimutham;

/*
arr={1,2,3,1,4}
k=3;
1,2,3=6
2,3,1=6
3,1,4=8
threshold=7>sum =print the count...
 */

public class CalculateMaxThreshold {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,4};
        int n= arr.length;
        int temp=0;
        int ans=0;
        int threshold=6;
        int l=0;
        int k=3;
        for (int r=0;r<n;r++){
            temp=temp+arr[r];

            if (r-l==k){ // 3-0==3
                temp=temp-arr[l]; // 1+2+3+1-1=6
                l++; //l=1
            }
            if (r-l+1==k){ // 2-0+1==3 true
                if (temp>=threshold){
                    ans++;
                }

            }

        }
        System.out.println(ans);
    }
}
