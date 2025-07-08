package DsaWithAnimutham;

public class ThreeHighestNumSubArray {
    public static void main(String[] args) {
        int[] arr = {5, 9, 1, 8, 7};
        int n = arr.length;
        int sl = 3;
        int ans = 0;
        for (int i = 0; i <= n - sl; i++) {
            int j = i + sl - 1;
//            System.out.println(i+ " "+j);
            int temp = 0;
            for (int k = i; k <= j; k++) {
                temp = temp + arr[k];
                System.out.println(temp);
            }
            ans = Math.max(ans, temp);

        }
        System.out.println(ans);

    }
}
