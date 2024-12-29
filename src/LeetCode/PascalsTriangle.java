package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> fun(int r) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        ans.add(firstRow);
        for (int i = 1; i < r; i++) {
            List<Integer> tempRow = new ArrayList<>();
            ans.add(tempRow);
            tempRow.add(1);

            for (int j = 1; j < i; j++) {
                int val = ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1);
                tempRow.add(val);
            }
            tempRow.add(1);
        }


        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fun(5));


    }
}
