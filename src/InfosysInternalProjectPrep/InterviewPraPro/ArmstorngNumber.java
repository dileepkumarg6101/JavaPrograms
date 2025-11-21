package InfosysInternalProjectPrep.InterviewPraPro;

import java.util.Scanner;

public class ArmstorngNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int number = sc.nextInt();
        sc.close();
        int dig = 0;
        int sum = 0;
        int temp = number;

        // finding the dig/count;
        while (number != 0) {
            dig++;
            number /= 10;
        }

        // find last digit and sum the values;
        number = temp;
        while (number != 0) {
            int ld = number % 10;
            sum += Math.pow(ld, dig);
            number /= 10;
        }
//        compare the Armstrong Number
        if (sum == temp) {
            System.out.println(temp + " :Armstrong Number");
        } else {
            System.out.println(temp + " :Not an Armstrong Number");
        }
    }
}
