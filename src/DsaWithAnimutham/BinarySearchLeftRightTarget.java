package DsaWithAnimutham;

public class BinarySearchLeftRightTarget {

    public static int binarySearchLeftTarget(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] >= target) {
                r = mid - 1;

            } else {
                l = mid + 1;
            }
        }
        if (l >= arr.length) {
            return -1;
        } else if (arr[l] != target) {
            return -1;

        }
        return l;
    }

    public static int binarySearchRightTarget(int[] arr, int target) {
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
        if (r > 0) {
            return -1;

        } else if (arr[r] != target) {
            return -1;
        }
        System.out.println(l + "," + r);
        return r;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 3, 5};
        int target = 0;
        int result = binarySearchLeftTarget(arr, target);
        System.out.println("index: " + result);

    }

}
