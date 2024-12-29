package LeetCode;

import java.util.HashMap;

/*
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
 */
public class MumJewelsInStonesHasmap771 {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i=0;i< stones.length();i++){
           char ch=stones.charAt(i);
           hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
        }
        int count=0;
        for (int i=0;i<jewels.length();i++){
            char ch=jewels.charAt(i);
            if (hashMap.containsKey(ch)){
                count=count+hashMap.get(ch);
            }
        }
        System.out.println(count);
    }
}
