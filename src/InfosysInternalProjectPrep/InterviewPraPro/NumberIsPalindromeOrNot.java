package InfosysInternalProjectPrep.InterviewPraPro;

public class NumberIsPalindromeOrNot {
    public static void main(String[] args) {

        int num = 123;
        int rev = 0;
        int temp = num;

        while (num != 0) {
            int ld = num % 10;
            rev = rev * 10 + ld;
            num /= 10;
        }
        if (rev == temp) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }


    }
}
