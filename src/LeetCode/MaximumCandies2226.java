package LeetCode;

/*
Input: candies = [5,8,6], k = 3
Output: 5
Explanation: We can divide candies[1] into 2 piles of size 5 and 3, and candies[2] into 2 piles of size 5 and 1. We now have five piles of candies of sizes 5, 5, 3, 5, and 1. We can allocate the 3 piles of size 5 to 3 children. It can be proven that each child cannot receive more than 5 candies.
 */
public class MaximumCandies2226 {
    public static boolean isPossible(int[] candies, double k, int mid) {
        for (int i = 0; i < candies.length; i++) {
            int temp = candies[i] / mid;
            k -= temp;

            if (k <= 0) {
                return true;
            }
        }
        return false;
    }

    public static int maximumCandies(int[] candies, long k) {
        int l = 1;
        int r = (int) Math.pow(10, 7);
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(candies, k, mid)) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return r;

    }

    public static void main(String[] args) {
//        int[] candies = {5, 8, 6};
//        int K = 3;
//        int result = maximumCandies(candies, K);
//        System.out.println(result);

        int[] candies = {2, 5};
        int K = 11;
        int result = maximumCandies(candies, K);
        System.out.println(result);
    }
}
