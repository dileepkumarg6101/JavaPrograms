package InfosysInternalProjectPrep.InterviewPraPro;

public class PrimeOrNot5 {
    public static void main(String[] args) {
        int number = 13;
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count==2){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }

    }


}
