package LeetCode;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = 0;
        int l = 0;
        HashSet<Character> hs = new HashSet<>();
        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            if (!hs.contains(ch)) {
                hs.add(ch);
            } else {
                while (hs.contains(ch)) {
                    hs.remove(s.charAt(l));
                    l++;
                }
                hs.add(ch);
            }
            ans = Math.max(r - l + 1, ans);
        }
        System.out.println(ans);
    }
}
