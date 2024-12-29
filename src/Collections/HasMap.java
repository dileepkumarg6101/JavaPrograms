package Collections;

import java.util.HashMap;

public class HasMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hasMap=new HashMap<>();
        hasMap.put(1,5);
        hasMap.put(2,6);
//        hasMap.put(7,14);
        int temp=hasMap.get(1);
        System.out.println(hasMap.get(2));
        System.out.println(temp+1);

//        if (hasMap.containsKey(7)){
//            int temp1= hasMap.get(7);
//            System.out.print("contains: ");
//            System.out.println(temp1);
//        }
        int n=7;
        if (hasMap.containsKey(n)){
            int temp2= hasMap.get(n);
            hasMap.put(n,temp2+1);
        }
        else {
            hasMap.put(n,14);
        }
        System.out.println(hasMap.get(7));

        for (int boom: hasMap.keySet()){
            System.out.println(boom+" "+ hasMap.get(boom));
        }

    }
}
