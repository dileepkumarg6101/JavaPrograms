package InfosysInternalProjectPrep.InterviewPraPro;

import java.util.Scanner;

//fibonaci series=0 1 1 2 3 5 8
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int fib = sc.nextInt();

        int f1 = 0;
        int f2 = 1;
        System.out.print("Fibonacci Series: "+f1 + ", " + f2);
        for (int i = 3; i <= fib; i++) {
            int f3 = f1+f2;
            f1 = f2;
            f2= f3;
            System.out.print(", "+f3);

        }
    }
}
