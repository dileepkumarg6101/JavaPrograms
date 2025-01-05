package LeetCode;

import java.util.Arrays;

/*
Input: position = [1,2,3,4,7], m = 3
Output: 3
Explanation: Distributing the 3 balls into baskets 1, 4 and 7 will make the magnetic force between ball pairs [3, 3, 6]. The minimum magnetic force is 3. We cannot achieve a larger minimum magnetic force than 3.
 */
public class MaxDistance1552 {

    public static boolean isPossible(int[] position, int m, int k) {
        int prev = position[0];
        m -= 1;
        for (int i = 1; i < position.length; i++) {
            int val = position[i];
            if (val - prev >= k) {
                m -= 1;
                prev = val;
            }
            if (m <= 0) {
                return true;
            }
        }
        return false;
    }

    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l = 0;
        int r = (int) Math.pow(10, 9);
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(position, m, mid)) {
                l = mid + 1;

            } else {
                r = mid - 1;
            }
        }
        return r;

    }

    public static void main(String[] args) {
        int[] position = {1, 2, 3, 4, 7};
        int m = 3;
        int result=maxDistance(position,m);
        System.out.println(result);


    }
}
