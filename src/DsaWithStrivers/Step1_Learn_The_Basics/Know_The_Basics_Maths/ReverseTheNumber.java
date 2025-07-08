package DsaWithStrivers.Step1_Learn_The_Basics.Know_The_Basics_Maths;

/*
Examples:
Input: n = 25

Output: 52

Explanation: Reverse of 25 is 52.

 */
public class ReverseTheNumber {
    public static void main(String[] args) {
        int number = 25;
        int rev = 0;
        int originalNumber = number;
        while (number != 0) {
            int ld = number % 10;
            rev=rev*10+ld;
            number /= 10;
        }
        System.out.println("The reverse of "+originalNumber+" is: " + rev);

    }
}
