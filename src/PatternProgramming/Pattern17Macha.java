package PatternProgramming;

public class Pattern17Macha {
    public static void main(String[] args) {
        int r = 4;
        int c = 20;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 || i == r - 1 || j == 0 || j == c - 1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
