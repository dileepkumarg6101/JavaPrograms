package DsaWithStrivers.Step1_Learn_The_Basics.Lec5_BasicRecursion;

public class UsingRecursionprintNumbers1toN {
    static void f(int i, int n){
        if (i>n){
            return;
        }
        System.out.print(i+ ",");
        f(i+1, n);
    }


    public static void main(String[] args) {
        int n = 4;
        f(1,n);
    }
}
