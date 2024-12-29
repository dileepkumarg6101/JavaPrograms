package InterviewPrograms;

import java.util.Scanner;

public class ArmstorngNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a input  number");
        int number = sc.nextInt();
        sc.close();

//        initilazation
        int dig = 0;
        int sum = 0;
        int originalNumber = number;

//        find the digits
        while (number != 0) {
            number /= 10;
            dig++;
        }

//        calculate the power and  usin the
        number = originalNumber;
        while (number != 0) {
            int lastDigit = number % 10;
            sum += Math.pow(lastDigit, dig);
            number /= 10;
        }
//        compare the Armstrong Number
        if(sum==originalNumber){
            System.out.println(originalNumber+ " :Armstrong Number");
        }
        else {
            System.out.println(originalNumber+ " :Not an Armstrong Number");
        }


    }

}
