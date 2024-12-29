package LeetCode;
/*
Input: nums = [7,1,5,4]
a=7
b=1
a>b
a-b
find max
Output: 4
 */

public class MaximumDifference2016 {

    public static void main(String[] args) {
        int num[] = {7, 1, 5, 4};
        int n = num.length;
        int max = -1;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = num[i];
                int b = num[j];
                if (a < b) {
                    int temp = b - a;
                    max = Math.max(temp, max);

                }

            }

        }
        System.out.println(max);


    }
}
