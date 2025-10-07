package InfosysInternalProjectPrep.InterviewPraPro;

public class CoutTheNumerOfDigits {
    public static void main(String[] args) {
        int num=12345;
        /* we are created a int val then for length need to convert to string and passing var
        there we cancheck the length with help of string

         */

        int length = String.valueOf(num).length();
        System.out.println(length);
    }

}
