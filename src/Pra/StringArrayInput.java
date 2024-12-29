package Pra;

import java.util.Scanner;

public class StringArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[length];

        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextLine();
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
        sc.close();


    }
}
