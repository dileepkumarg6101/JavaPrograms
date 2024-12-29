package LeetCode;

public class BinarySearch204Copy {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int l = 0;
        int ans = -1;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - 1) / 2;
            if (nums[mid] == target) {
                ans = mid;
                break;
            } else if (nums[mid] > target) {
                r = mid - 1;

            } else if (nums[mid] < target)
                l = mid + 1;
        }
        System.out.println(ans);
    }

}

