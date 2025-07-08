package DsaWithAnimutham;

public class BinarySearchExample1 {
    public static int binarySearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                r = mid - 1;
            } else if (arr[mid] < target) {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 12, 14, 16, 20, 25, 27, 30};
        int target = 14;
        int result = binarySearch(arr, target);
        System.out.println("index: "+result);
    }
}
