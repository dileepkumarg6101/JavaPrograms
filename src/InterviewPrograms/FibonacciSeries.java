package InterviewPrograms;

import java.util.Scanner;
//fibonaci series=0 1 1 2 3 5 8
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the terms ");
        int terms= sc.nextInt();
        sc.close();

        int first=0,second=1;
        System.out.print("Fibonacci Series:" + first +","+ second);

        for (int i=3;i<=terms;i++){
            int res=first+second;
            System.out.print(","+res);
            first=second;
            second=res;

        }
    }
}
