package LeetCode;
/*
1.store the values
2. remove the values
3. check the ans
4. print it
 */
public class MaximizeTheConfuse2024 {
    public static void main(String[] args) {

        String answerKey = "TTFF";
        int l = 0;
        int ans = 0;
        int k = 2;
        int cntt = 0;
        int cntf = 0;
        int n=answerKey.length();
        for (int r=0;r<n;r++){
            char ch=answerKey.charAt(r);
            if (ch=='T'){
                cntt++;
            }
            else {
                cntf++;
            }
            while (Math.min(cntf,cntt)>k){
                if (answerKey.charAt(l)=='T'){
                    cntt--;
                }
                else {
                    cntf--;
                }
                l++;

            }
            ans=Math.max(ans,r-l+1);
        }
        System.out.println(ans);
    }
}
