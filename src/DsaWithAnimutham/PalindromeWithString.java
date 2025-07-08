package DsaWithAnimutham;

public class PalindromeWithString {
    public static void main(String[] args) {
        String s = "madam";
        int n = s.length();
        System.out.println(n);
        boolean palindrome = true;
        for (int i = 0; i <= n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }


    }
}
