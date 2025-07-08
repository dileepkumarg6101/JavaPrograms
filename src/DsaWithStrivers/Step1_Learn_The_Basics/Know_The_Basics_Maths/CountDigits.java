package DsaWithStrivers.Step1_Learn_The_Basics.Know_The_Basics_Maths;

/*
Input: n = 4

Output: 1

Explanation: There is only 1 digit in 4.

 */
public class CountDigits {
    public static void main(String[] args) {
        int number = 2468;
        int count = 0;
        int originalNumber = number;
        while (number != 0) {
            int ld = number % 10;
            count++;
            number /= 10;
        }
        System.out.println("The count of "+originalNumber+" is: " + count);

    }
}
