package LeetCode;

/*
Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
Output: 15
Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
1st day: 1, 2, 3, 4, 5
2nd day: 6, 7
3rd day: 8
4th day: 9
5th day: 10
 */
public class ShipWithinDays1011 {
    public static boolean isPossible(int[] weights, int days, int k) {
        int temp = 0;
        for (int i = 0; i < weights.length; i++) {
            int val = weights[i];
            if (val > k) {
                return false;
            }
            if (temp + val > k) {
                days -= 1;
                temp = 0;
            }
            temp += val;
            if (days <= 0) {
                return false;
            }
        }
        return true;
    }

    public static int shipWithinDays1011(int[] weights, int days) {
        int l = 1;
        int r = 25 * (int) Math.pow(10, 6);
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(weights, days, mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        int result = shipWithinDays1011(weights, days);
        System.out.println(result);
    }
}
