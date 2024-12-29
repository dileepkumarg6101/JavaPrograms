package CommonPrograms;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("entrr you're name");
        String name=sc.nextLine();
        System.out.println("enter you're age");
        int age=sc.nextInt();


        System.out.println(name);
        System.out.println(age);


    }
}
