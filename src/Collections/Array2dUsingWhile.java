package Collections;

public class Array2dUsingWhile {
    public static void main(String[] args) {
        int math[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int r = math.length;
        int c = math[0].length;
        int i = 0;
        int j = 0;
        while (i < r && j < c) {
            System.out.println(math[i][j]);
            i++;
            j++;
        }
    }
}
