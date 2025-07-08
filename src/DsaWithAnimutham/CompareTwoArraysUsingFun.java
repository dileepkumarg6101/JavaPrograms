package DsaWithAnimutham;

public class CompareTwoArraysUsingFun {
    public static boolean fun(int[] arra, int[] arrb) {
        for (int i = 0; i < arra.length; i++) {
            if (arra[i] != arrb[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arra[] = {1, 2, 5};
        int arrb[] = {1, 2, 3};
       boolean res=fun(arra,arrb);
        System.out.println(res);

    }
}
