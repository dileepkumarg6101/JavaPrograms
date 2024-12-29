package LeetCode;

public class MaxDistance2078 {
    public static void main(String[] args) {

        int colors[] = {1, 1, 1, 6, 1, 1, 1};
        int n = colors.length;
        int max = 0;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (colors[j]!=colors[i]){
                    int temp=j-i;
                    max=Math.max(temp,max);
                }
            }

        }
        System.out.println(max);
    }
}
