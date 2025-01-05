package LeetCode;

/*
Input: nums = [9], maxOperations = 2
Output: 3
Explanation:
- Divide the bag with 9 balls into two bags of sizes 6 and 3. [9] -> [6,3].
- Divide the bag with 6 balls into two bags of sizes 3 and 3. [6,3] -> [3,3,3].
The bag with the most number of balls has 3 balls, so your penalty is 3 and you should return 3.
 */
public class MinimumSize1760 {

    public static boolean isPossible(int[] nums, int maxOperations, int k) {
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            int temp = val / k;
            if (val % k != 0) {
                temp++;
            }
            temp--;
            maxOperations -= temp;
            if (maxOperations < 0) {
                return false;
            }

        }
        return true;
    }

    public static int minimumSize(int[] nums, int maxOperations) {
        int l = 1;
        int r = (int) Math.pow(10, 9);
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(nums, maxOperations, mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {

        int[] nums = {2, 4, 8, 2};
        int maxOperations = 4;
        int result1 = minimumSize(nums, maxOperations);
        System.out.println("output:" + result1);


    }
}
