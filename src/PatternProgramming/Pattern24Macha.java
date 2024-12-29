package PatternProgramming;

public class Pattern24Macha {
    public static void main(String[] args) {
        int n = 4;
        for (int i = n-1; i>=0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                if (i == n - 1 || k == 0 || k == 2 * i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
