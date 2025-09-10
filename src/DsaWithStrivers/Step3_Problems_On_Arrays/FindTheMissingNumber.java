package DsaWithStrivers.Step3_Problems_On_Arrays;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = arr.length;

        for (int i = 1; i < n + 1; i++) {
            int flag = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(i + ": is the missing number");
            }
        }

    }
}
