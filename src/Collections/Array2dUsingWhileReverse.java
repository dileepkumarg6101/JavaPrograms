package Collections;

public class Array2dUsingWhileReverse {
    public static void main(String[] args) {
        int math[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int r = math.length;
        int c = math[0].length;
        int i = 0;
        int j = c-1;
        while (i < r && j >=0) {
            System.out.println(math[i][j]);
//            System.out.println(i+" "+j);
            i++;
            j--;
        }
    }
}
