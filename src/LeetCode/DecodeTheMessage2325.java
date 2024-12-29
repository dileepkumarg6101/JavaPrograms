package LeetCode;

import java.util.HashMap;

/*
Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
Output: "this is a secret"

first store the askey values in key.
second message comapre with hasmap key if avilable store the val

 */
public class DecodeTheMessage2325 {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        HashMap<Character, Character> hashMap = new HashMap<>();
        int temp = 97;
        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            if (ch != ' ' && !hashMap.containsKey(ch)) {
                hashMap.put(ch, (char) temp);
                temp++;
            }
        }
        String res = "";
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (ch != ' ') {
                char val = hashMap.get(ch);
                res = res + val;
            } else {
                res += ' ';
            }
        }
        System.out.println(res);


    }
}
