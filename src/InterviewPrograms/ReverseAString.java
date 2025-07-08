package InterviewPrograms;

public class ReverseAString {
    public static void main(String[] args) {
        // normal flow
        /*
        String input = "mama";
        String s = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            s += input.charAt(i);

        }
        System.out.println(s);

         */
        // using stringBuilder...........
        /*
        String input = "mama";
        String res = new StringBuilder(input).reverse().toString();
        System.out.println(res);

         */

        // using StringBuffer.....
        String input = "mama";
        StringBuffer res = new StringBuffer(input).reverse();
        System.out.println(res);



    }
}
