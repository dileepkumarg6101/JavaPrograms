package Dsa;

import java.util.HashSet;

public class RemoveDuplicateCharactersInString {
    public static void main(String[] args) {
        String s="abcabcbb";
        HashSet<Character> hs = new HashSet<>();
        for (int i=0;i<s.length()-1;i++) {
            Character ch = s.charAt(i);
            if (!hs.contains(ch)){
                hs.add(ch);
            }
            else {
                continue;
            }

        }
        System.out.println(hs);



    }
}
