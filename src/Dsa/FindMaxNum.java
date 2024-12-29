package Dsa;

public class FindMaxNum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 67, 99, 8};
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = Math.max(arr[i], ans);
        }
        System.out.println(ans);

    }
}
