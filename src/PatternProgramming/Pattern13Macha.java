package PatternProgramming;

public class Pattern13Macha {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("*");
                if (j!=n-1){
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }


}
