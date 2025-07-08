package DsaWithStrivers.Step1_Learn_The_Basics.Know_The_Basics_Maths;

/*
Examples:
Input: n = 25

Output: 52

Explanation: Reverse of 25 is 52.

 */
public class PalindromeorNot {
    public static void main(String[] args) {
        int number = 123;
        int revNumber = 0;
        int originalNumber = number;
        while (number != 0) {
            int ld = number % 10;
            revNumber = revNumber * 10 + ld;
            number /= 10;
        }
        if (revNumber == originalNumber) {
            System.out.println("The palindrome of " + originalNumber + " is: " + revNumber);
        } else {
            System.out.println("The number is: " + originalNumber + " not a palindrome ");

        }


    }
}
