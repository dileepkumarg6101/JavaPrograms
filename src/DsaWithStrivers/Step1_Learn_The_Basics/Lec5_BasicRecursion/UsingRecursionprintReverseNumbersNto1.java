package DsaWithStrivers.Step1_Learn_The_Basics.Lec5_BasicRecursion;

public class UsingRecursionprintReverseNumbersNto1 {
    static void f(int i) {
        if (i < 1) {
            return;
        }
        System.out.print(i+ ",");
        f(i - 1);

    }

    public static void main(String[] args) {
        int i = 4;
        f(i);
    }

}
