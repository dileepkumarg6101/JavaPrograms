package InterviewPrograms;

import java.util.Scanner;

/*
number=121
1. need to store a num in temp
2.we need to reverse a number
3.lastDigit=num%10;
4.need to apply a condition to one dig before: res=res*10+lastDigit;
5.remove num=num/10;
6. compare the results...
 */
public class NumberIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int res = 0;
        int temp = num;
        while (num != 0) {
            int lastDigit = num % 10;
            res = res * 10 + lastDigit;
            num = num / 10;
        }
        if (temp == res) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");

        }
        sc.close();
    }
}
