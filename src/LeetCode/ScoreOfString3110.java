package LeetCode;

/*
Input: s = "hello"

Output: 13

Explanation:

The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111. So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.
 */
public class ScoreOfString3110 {
    public static void main(String[] args) {
        String s = "hello";
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int a = i;
            int b = i + 1;
            char first = s.charAt(a);
            char second = s.charAt(b);
            int aascii = first;
            int bascii = second;
            int temp = Math.abs(aascii - bascii);
            sum = sum + temp;

        }
        System.out.println(sum);

    }
}
