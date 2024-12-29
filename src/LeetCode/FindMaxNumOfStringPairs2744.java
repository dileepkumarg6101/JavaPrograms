package LeetCode;
/*
Input: words = ["cd","ac","dc","ca","zz"]
Output: 2
 */
public class FindMaxNumOfStringPairs2744 {

    public static String reverse(String s){
        String rev="";
        for (int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        int ans=0;

    String[] words = {"cd","ac","dc","ca","zz"};
    int n=words.length;
    for (int i=0;i<n;i++){
//        System.out.println(n-1);
        for (int j=i+1;j<n;j++){
//            System.out.println(i+" "+j);
            String a=words[i];
            String b=words[j];
//            System.out.println(a+" "+b);
            if (!b.equals("0")){
                String revb=reverse(b);
                if (revb.equals(a)){
                    ans++;
                    break;
                }

            }

        }


    }
        System.out.println(ans);

}

}
