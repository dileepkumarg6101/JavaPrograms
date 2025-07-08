package DsaWithAnimutham;

import java.util.HashMap;

/*
store
add
remove
compare and print
 */
public class CountGoodSubStrings {
    public static void main(String[] args) {
        String s = "abccde";
        HashMap<Character, Integer> hs = new HashMap<>();
        int l = 0;
        int ans = 0;
        int sl = 3;
        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            hs.put(ch, hs.getOrDefault(ch, 0) + 1);
            if (r - l == sl) {
                char tch = s.charAt(l);
                hs.put(tch, hs.get(tch) - 1);
                if (hs.get(tch) == 0) {
                    hs.remove(tch);
                }
                l++;
            }
            if (hs.size() == sl) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
