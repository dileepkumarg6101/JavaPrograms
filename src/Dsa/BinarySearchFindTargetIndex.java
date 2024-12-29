package Dsa;

public class BinarySearchFindTargetIndex {
    public static int binarySearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;

            }
        }

        return l;
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 9};
        int target = 4;
        int result = binarySearch(arr, target);
        System.out.println(result);
    }
}
