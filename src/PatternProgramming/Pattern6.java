package PatternProgramming;

//123
//        456
//        789
public class Pattern6 {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }

}
