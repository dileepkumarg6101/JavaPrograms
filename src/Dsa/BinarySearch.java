package Dsa;

/*
Max binary sub array length with atmost K 0's
[1,1,0,1,0,0,0]
k=2
 */
public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {1, 1, 0, 1, 0, 0, 0};
        int n = nums.length;
        int k = 2;
        int temp = 0;
        int l = 0;
        int ans = 0;
        for (int r = 0; r < n; r++) {
            if (nums[r] == 0) {
                temp++;
            }
            while (temp > k) {
                if (nums[l] == 0) {
                    temp--;
                }
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        System.out.println(ans);
    }
}
