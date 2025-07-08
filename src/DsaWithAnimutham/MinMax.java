package DsaWithAnimutham;

public class MinMax {
    public static void main(String[] args) {

        int arr[] = {-9, -6, -2};
        int max=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        System.out.println(max);


    }
}
