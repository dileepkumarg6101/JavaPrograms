package InterviewPrograms;

import java.util.Scanner;

public class PrimeNumbersUsingScanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {

            int count = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i + " Number is prime number");
            }
        }
        sc.close();
    }
}
