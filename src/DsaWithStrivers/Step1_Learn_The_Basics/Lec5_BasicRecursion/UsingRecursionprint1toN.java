package DsaWithStrivers.Step1_Learn_The_Basics.Lec5_BasicRecursion;
/*

 */
public class UsingRecursionprint1toN {
    static void f(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("dileep");
        f(i + 1, n);
    }

    public static void main(String[] args) {
        int n = 3;
        f(1, n);
    }

}
