package LeetCode;

import java.util.Arrays;

/*
we have chocos if we take 2 we will get one.
then add the price of 2..
 */
public class TwoPointersAndSlidingWindow2144 {
    public static void main(String[] args) {

        int cost[] = {6, 5, 7, 9, 2, 2};
        Arrays.sort(cost); // 2,2,5,6,7,9
        int took = 0; //1;2;0;1;2;0
        int ans = 0; //9;16;23
        for (int i = cost.length - 1; i >= 0; i--) { // i=5;5>=0;5--
            // i=5,4,3,2,1,0
            if (took == 2) {
                took = 0;
            } else {
                ans += cost[i]; //9+7+5+2
                took++;
            }
            System.out.println(ans); //23
        }
    }
}
