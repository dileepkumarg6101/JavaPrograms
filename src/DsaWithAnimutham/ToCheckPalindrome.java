package DsaWithAnimutham;

public class ToCheckPalindrome {
    public static void main(String[] args) {
        String s = "bab";
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            res = res + s.charAt(i);
        }
        if (res.equals(s)) {
            System.out.println("it's palindrome");
        } else {
            System.out.println("not a palindrome");
        }

    }


}
