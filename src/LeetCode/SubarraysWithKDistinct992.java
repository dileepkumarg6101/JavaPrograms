package LeetCode;

import java.util.HashMap;

/*
Example 1:
Input: nums = [1,2,1,2,3], k = 2
Output: 7
Explanation: Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2]
 */
public class SubarraysWithKDistinct992 {
    public static int atMostK(int[] nums, int k) {
        int l = 0;
        int n = nums.length;
        int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int r = 0; r < n; r++) {
            int val = nums[r];
            hm.put(val, hm.getOrDefault(val, 0) + 1);

            while (hm.size() > k) {
                System.out.println(hm.size() + ": " + (r - l + 1));
                int vall = nums[l];
                hm.put(vall, hm.get(vall) - 1);
                if (hm.get(vall) == 0) {
                    hm.remove(vall);
                }
                l++;
            }
            ans += r - l + 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;
        int result = atMostK(nums, k) - atMostK(nums, k - 1);
        System.out.println(result);


    }
}
