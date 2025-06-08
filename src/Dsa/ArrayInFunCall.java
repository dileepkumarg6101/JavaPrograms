package Dsa;

public class ArrayInFunCall {

    public static int[] fun() {
        int arr[] = {2, 3, 4, 5};
        return arr;
    }

    public static void main(String[] args) {
        int[] result = fun();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
