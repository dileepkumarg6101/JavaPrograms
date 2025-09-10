package DsaWithStrivers.Step3_Problems_On_Arrays;

public class GetSingleElement {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println(ans); // Should print 4
    }

    private static int getSingleElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    count++;
                }
            }
            if (count == 1) {
                return num;
            }
        }
        return -1;
    }
}
