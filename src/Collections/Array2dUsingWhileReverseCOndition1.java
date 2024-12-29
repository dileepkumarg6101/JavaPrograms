package Collections;

public class Array2dUsingWhileReverseCOndition1 {
    public static void main(String[] args) {
        int math[][] = {{1, 2, 3, 1}, {4, 5, 6, 1}, {7, 8, 9, 1}};
        int r = math.length;
        int c = math[0].length;
        int i = 0;
        int j = i + 1;
        while (i < r && i < c) {
            System.out.println(math[i][j]);
//            System.out.println(i + " " + j);
            i++;
            j++;
        }
    }
}
