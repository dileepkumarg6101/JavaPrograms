package LeetCode;

/*
Input: bloomDay = [7,7,7,7,12,7,7], m = 2, k = 3
Output: 12

 */
public class MinDays1482 {
    public static boolean isPossible(int[] bloomDay, int m, int k, int days) {
        int took = 0;
        for (int i = 0; i < bloomDay.length; i++) {

            if (days >= bloomDay[i]) {
                took++;
            } else {
                took = 0;
            }
            if (took == k) {
                m -= 1;
                took = 0;
            }
            if (m == 0) {
                return true;
            }
        }
        return false;
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        int tempr = (int) Math.pow(10, 9);

        int l = 1;
        int r = tempr;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(bloomDay, m, k, mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        if (l == tempr + 1) {
            return -1;
        }

        return l;
    }


    public static void main(String[] args) {

        int[] bloomDay = {7, 7, 7, 7, 12, 7, 7};
        int m = 2;
        int k = 3;
        int result = minDays(bloomDay, m, k);
        System.out.println(result);

    }
}
