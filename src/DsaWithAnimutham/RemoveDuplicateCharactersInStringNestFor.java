package DsaWithAnimutham;

public class RemoveDuplicateCharactersInStringNestFor {
    public static void main(String[] args) {
        String s = "abcabcbb";
        char ch[]=s.toCharArray();
        int count=0;
        for (int i=0;i<s.length();i++) {
            char temp = ch[i];
            boolean isDuplicate=false;

            for (int j = 0; j <i; j++) {
                if (temp== ch[j]) {
                    isDuplicate=true;
                    break;
                }
            }
            if (!isDuplicate){
                count++;
            }

        }
        System.out.println(count);
    }
}
