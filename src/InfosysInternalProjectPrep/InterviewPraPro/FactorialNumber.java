package InfosysInternalProjectPrep.InterviewPraPro;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the factorial number: ");
        int fact = sc.nextInt();
        int f =1;
        for (int i=1; i<=fact;i++){
            f = f*i;

        }
        System.out.println(f);



    }
}
