package Collections;

import java.util.HashMap;

public class HasmapWithString {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        String[] arr={"Dileep","madhu","madhu"};
        for (int i=0;i< arr.length;i++){
            String key=arr[i];
            hashMap.put(key,hashMap.getOrDefault(key,0)+1);
//            if (hashMap.containsKey(key)){
//                int val=hashMap.get(key);
//                hashMap.put(key,val+1);
//            }
//            else {
//                hashMap.put(key,1);
//            }
        }
        for (String s:hashMap.keySet()){
            System.out.println(s+"->"+hashMap.get(s));

        }


    }
}
