package PatternProgramming;

public class Pattern18Macha {
    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k=0;k<4;k++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
