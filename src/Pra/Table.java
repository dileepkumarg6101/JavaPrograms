package Pra;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ente the number please:");
        int number = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            String res = number + "*" + i + "=" + (number * i);
//            System.out.println(number + "*" + i + "=" + (number * i));
            System.out.println(res);

        }


    }
}
