package InterviewIfosys;

public class YaminiInfosys {
    public static void main(String[] args) {
        String name = "yamini molaka";
        String ans = "";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch != ' ') {
                ans += ch;
                if (i < name.length() - 1 && name.charAt(i + 1) != ' ') {
                    ans += "_";
                }
            } else if (i > 0 && ans.charAt(ans.length() - 1) != '_') {
                ans += "_";
            }
        }
        System.out.println(ans);
    }
}
