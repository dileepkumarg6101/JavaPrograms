package LeetCode;

import java.util.HashMap;

public class MajorityElementHasmap169 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] nums = {3, 2, 3, 2, 2};
        for (int i = 0; i < nums.length; i++) {
//            int key=nums[i];
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }
        int result = 0;
        int n = nums.length / 2;
        for (int res : hashMap.keySet()) {
//            int val=hashMap.get(res);
            if (hashMap.get(res) > n) {
//               return res;
                System.out.println(res);
            }
        }
//        System.out.println(res);
    }
}
