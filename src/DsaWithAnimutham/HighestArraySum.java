package DsaWithAnimutham;

public class HighestArraySum {
    public static void main(String[] args) {
        int[] arr={5,9,1,8,7};
        int n= arr.length;
        int ans=0;
        for (int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=0;
                for (int k=i;k<=j;k++){
                    temp=temp+arr[k];
                }
                ans=Math.max(ans,temp);
                System.out.println(ans);
            }
        }
        System.out.println(ans);

    }
}
