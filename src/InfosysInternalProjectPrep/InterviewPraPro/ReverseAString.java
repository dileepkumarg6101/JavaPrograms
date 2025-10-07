package InfosysInternalProjectPrep.InterviewPraPro;

public class ReverseAString {

    public static void main(String[] args) {
        /*
        // 1. Using for loop (basic way)
        String name = "mama";
        int size = name.length();
        String res = "";

        for (int i = size - 1; i >= 0; i--) { // am1
            res += name.charAt(i);

        }
        System.out.println(res);

         */

        // using String Buffer
        String name = "mama";
        String res = new StringBuilder(name).reverse().toString();
        System.out.println(res);


        // using string Builder
        /*
        String name1= "ammaa";
        String res1  = new StringBuilder(name1).reverse().toString();
        System.out.println(res1);

         */
        // using string Builder
        String name1 = "ammaa";
        StringBuilder res1 = new StringBuilder(name1).reverse();
        System.out.println(res1);

        // 4. Using Character Array

        String name2 = "moms";
        char[] ch = name2.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        System.out.println(rev);


    }
}
