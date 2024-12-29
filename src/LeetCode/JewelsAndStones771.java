package LeetCode;

public class JewelsAndStones771 {
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        int ans=0;
        for (int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            boolean found=false;
            for (int j=0;j<jewels.length();j++){
                char dia=jewels.charAt(j);
                if (ch==dia){
                    found=true;
                    break;
                }
            }
            if (found){
                ans=ans+1;

            }

        }
        System.out.println(ans);

    }

}
