package DsaWithStrivers.Step1_Learn_The_Basics.Lec5_BasicRecursion;

public class PalindromeCheck {
    static boolean isPalindrome(int i, String s) {
        if (i >= s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        return isPalindrome(i+1, s);
    }

    public static void main(String[] args) {
        String s = "madam";
        boolean result = isPalindrome(0, s);
        System.out.println(result);
    }
}