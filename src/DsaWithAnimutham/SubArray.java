package DsaWithAnimutham;

public class SubArray {
    public static void main(String[] args) {
        int[] arr={1,3,5,7};
        int n= arr.length;;
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();

            }

        }
    }
}
