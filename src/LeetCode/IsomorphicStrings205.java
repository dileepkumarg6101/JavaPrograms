package LeetCode;

import java.util.HashMap;

/*
Input: s = "egg", t = "add"

Output: true
 */
public class IsomorphicStrings205 {
    public static void main(String[] args) {
        HashMap<Character, Character> hashMap = new HashMap<>();
        HashMap<Character, Character> rev = new HashMap<>();
        String s = "egg";
        String t = "add";
        boolean res = true;
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (!hashMap.containsKey(ch1) && !rev.containsKey(ch2)) {
                hashMap.put(ch1, ch2);
                rev.put(ch2, ch1);
            } else if (hashMap.containsKey(ch1) && hashMap.get(ch1) != ch2) {
                res = false;
                break;
            } else if (rev.containsKey(ch2) && rev.get(ch2) != ch1) {
                res = false;
                break;

            }

        }
        System.out.println(res);

    }
}
