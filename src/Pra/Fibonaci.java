package Pra;

import java.util.Scanner;

/*
0 1 1 2 3 5 8 13....
1.Initilazation..
2.arrange the nubers
3.sum
 */
public class Fibonaci {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the terms");
//        int terms = sc.nextInt();
//
//        int num1 = 0;
//        int num2 = 1;
//        System.out.print("Fibonacci Series"+num1+","+num2);
//        int res = 0;
//        for (int i=3;i<=terms;i++) {
//            res = num1 + num2;
//            System.out.print(","+res);
//            num1 = num2;
//            num2 = res;
//
//        }
        Scanner sc = new Scanner(System.in);
            System.out.println("enter the terms");
            int terms=sc.nextInt();
            int firstNum=0;
            int secondNum=1;
            int res=0;
            System.out.print("Finonacci Numbers:"+firstNum+" "+secondNum);

            for (int i=3;i<=terms;i++){
                res=firstNum+secondNum;
                System.out.print(","+res);
                firstNum=secondNum;
                secondNum=res;
            }

    }


}

