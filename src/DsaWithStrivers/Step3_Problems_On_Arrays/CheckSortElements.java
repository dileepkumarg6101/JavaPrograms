package DsaWithStrivers.Step3_Problems_On_Arrays;
public class CheckSortElements {
    static Boolean isSorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            System.out.println(arr[i]);

            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4};
        int n = arr.length;
        Boolean res = isSorted(arr, n);
        System.out.println(res);
    }
}
