package LeetCode;

public class BestTimeToBuyAndSellStock121 {
    public static void main(String[] args) {

    int arr[]={7,1,5,3,6,4};
    int n= arr.length;
    int profit=0;
    int low=arr[0];
    for (int i=1;i<n-1;i++){
            int temp=arr[i]-low;
            profit=Math.max(profit,temp);
            if (arr[i]<low){
                low=arr[i];

            }

    }
        System.out.println(profit);
}
}
