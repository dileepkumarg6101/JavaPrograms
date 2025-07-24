package DsaWithStrivers.Step1_Learn_The_Basics.Lec5_BasicRecursion;

public class FactorialUsingRecursion {
    static void f(int i, int f) {
        if (i > 5) {
            System.out.println(f);
            return;
        }
        f = f * i;

        f(i +1, f);
    }
    public static void main(String[] args) {
        int i = 1;
        int f = 1;
        f(i, f);
    }
}
