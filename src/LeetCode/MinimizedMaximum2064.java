package LeetCode;

/*
Input: n = 6, quantities = [11,6]
Output: 3
Explanation: One optimal way is:
- The 11 products of type 0 are distributed to the first four stores in these amounts: 2, 3, 3, 3
- The 6 products of type 1 are distributed to the other two stores in these amounts: 3, 3
The maximum number of products given to any store is max(2, 3, 3, 3, 3, 3) = 3.
 */
public class MinimizedMaximum2064 {
    public static boolean isPossible(int n, int[] quantities, int limit) {

        for (int i = 0; i < quantities.length; i++) {
            int val = quantities[i];
            int temp = val / limit;
            if (val % limit != 0) {
                temp++;
            }
            n -= temp;
            if (n < 0) {
                return false;
            }
        }
        return true;
    }

    public static int minimizedMaximum(int n, int[] quantities) {
        int l = 1;
        int r = (int) Math.pow(10, 5);
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(n, quantities, mid)) {
                r = mid - 1;

            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] quantities = {11, 6};
        int result = minimizedMaximum(n, quantities);
        System.out.println(result);
    }
}
