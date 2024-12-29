package LeetCode;

import java.util.HashMap;

public class FruitIntoBasket904 {
    public static void main(String[] args) {
        int[] fruits = {0, 1, 2, 2};
        int ans = 0;
        int l = 0;
        int n = fruits.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int r = 0; r < n; r++) {
            int val = fruits[r];
            hm.put(val, hm.getOrDefault(val, 0) + 1);

            while (hm.size() > 2) {
                int vall = fruits[l];
                hm.put(vall, hm.get(vall) - 1);

                if (hm.get(vall).equals(0)) {
                    hm.remove(vall);
                }
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        System.out.println(ans);


    }
}
