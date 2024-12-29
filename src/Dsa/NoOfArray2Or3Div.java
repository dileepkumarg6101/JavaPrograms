package Dsa;

public class NoOfArray2Or3Div {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 1, 1, 1, 3, 3,};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 || arr[i]%2==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
