package DsaWithStrivers.Step1_Learn_The_Basics.Lec5_BasicRecursion;

public class UsingRecursionprintNumWitoutAddition {
    static void f(int i, int n){
        if (i<1){
            return;
        }

        f(i-1, n);
        System.out.println(i);
    }


    public static void main(String[] args) {
        int n =4;
        f(n,n);
    }
}
