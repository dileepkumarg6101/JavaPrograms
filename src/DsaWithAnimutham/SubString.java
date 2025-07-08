package DsaWithAnimutham;

import java.util.ArrayList;

public class SubString {
    public static void main(String[] args) {
        String s="vig";
        int n= s.length();
        ArrayList<String>arrayList=new ArrayList<>();
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                String temp=(s.substring(i,j+1));
                arrayList.add(temp);

            }
//            System.out.println();

        }
        System.out.println(arrayList);
    }
}
