package DsaWithAnimutham;

import java.util.HashMap;

public class PassACollectionsIntoMethod {
    public static void fun(HashMap<Integer,Integer> hm){
        System.out.println(hm);
    }

    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(1,2);
        hm.put(2,2);
        hm.put(3,2);
        fun(hm);


    }
}
