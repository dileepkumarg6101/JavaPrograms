package DsaWithAnimutham;

import java.util.Scanner;

public class CountingStringWithDigit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String value");
        String name=sc.nextLine();
        System.out.println("enter the input");
        int num=sc.nextInt();
       fun(name,num);
    }
    public static void fun(String s,int n){
        for (int i=0;i<=n;i++){
            System.out.println(s);
        }

    }
//    public static String CustomerName(){
//
//        return "Dileep";
//    }


}
