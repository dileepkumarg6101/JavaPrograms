package LeetCode;

public class DefangingAnIPAddress1108 {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String ans = "";
        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if (ch == '.') {
                ans = ans + "[.]";

            } else {
                ans = ans + ch;
            }

        }
        System.out.println(ans);
    }
}
