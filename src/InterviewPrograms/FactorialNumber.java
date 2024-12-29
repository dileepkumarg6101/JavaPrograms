package InterviewPrograms;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // Prompt user for input
        System.out.println("enter the number please");
        int number= sc.nextInt();

        long f=1; // Use long to handle large factorial values
        for (int i=1;i<=number;i++){
            f=f*i;// Multiply factorial by i in each iteration

        }
        // Display the result
        System.out.println("Factorial of " + number + " is: " + f);
        sc.close();
    }
}
