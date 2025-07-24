package DsaWithStrivers.Step1_Learn_The_Basics.Lec5_BasicRecursion;
/*
here we are printing the sum value using the recursions......
 */
public class PrintSumUsingRecursion {
    static void f(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        f(i - 1, sum + i);
    }
    public static void main(String[] args) {
        int n = 3;
        int sum = 0;
        f(n, sum);
    }
}
