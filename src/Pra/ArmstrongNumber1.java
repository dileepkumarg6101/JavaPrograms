package Pra;

import java.util.Scanner;

/*
153> 1^3+5^3+3^3=152
1.initilazation
2.find number of digits
3. need to sum the digits with each number
4.compare the results
 */
public class ArmstrongNumber1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();

        int dig = 0;
//        int num = 153;
        int temp = num;
        int sum = 0;

        while (num != 0) {
            num = num / 10;  // Update num to remove the last digit
            dig++;
        }
        num=temp;
        while (num!=0) {
            int lastDigit = num % 10;
            sum += Math.pow(lastDigit, dig);
            num = num / 10;
        }
        if (temp==sum){
            System.out.println("ArmstrongNumber");
        }
        else {
            System.out.println("not a ArmstrongNumber");

        }
    }
}
