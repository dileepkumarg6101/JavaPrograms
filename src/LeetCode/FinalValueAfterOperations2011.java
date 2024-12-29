package LeetCode;

public class FinalValueAfterOperations2011 {
    public static void main(String[] args) {
        String[] operations = {"--X", "X++", "X++"};
        int sum=0;
        for (int i=0;i< operations.length;i++){
            String temp=operations[i];
            if (temp.equals("++X") || temp.equals("X++")){
                sum=sum+1;

            }
            else {
                sum=sum-1;
            }
        }
        System.out.println(sum);


    }
}
