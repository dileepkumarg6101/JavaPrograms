package Collections;

public class Array2dUsingWhileReverseCOndition2 {
    public static void main(String[] args) {
        int math[][] = {{1, 2, 3, 1}, {4, 1, 6, 1}, {7, 8, 1, 5}};
        int r = math.length;
        int c = math[0].length;
        int i = 0;
        int j = 0;
        int temp=math[i][j];
        boolean res=true;
        while (i<r && j<c) {
            if (math[i][j]!=temp) {
                res = false;
            }
            i++;
            j++;
        }
        System.out.println(res);
    }
}
