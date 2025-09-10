package DsaWithStrivers.Step3_Problems_On_Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {

        int[] num = {1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxi = 0;
        for (int i =0; i< num.length; i++){
            if (num[i] == 1){
                count++;
                maxi  = Math.max(maxi,count);
            }
            else {
                count = 0;
            }
        }
        System.out.println(maxi);
    }

}
