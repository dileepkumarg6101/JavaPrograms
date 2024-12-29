package Collections;

import java.util.HashMap;

public class HasMapWorking {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int[] arr={1,2,3,4,5,6,1,2};
        for (int i=0;i< arr.length;i++){
            int n=arr[i];
            if (hashMap.containsKey(n)){
                int temp=hashMap.get(n);
                hashMap.put(n,temp+1);
            }
            else {
                hashMap.put(n,1);
            }
        }
        for (int result: hashMap.keySet()){
            System.out.println(result+"->"+hashMap.get(result));

        }

    }

}
