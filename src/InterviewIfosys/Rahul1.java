package InterviewIfosys;

import java.util.HashMap;
import java.util.Map;

public class Rahul1 {
    public static void main(String[] args) {
        int array1[] = {12, 34, 65, 85, 21, 33, 12, 37};
        int array2[] = {13, 38, 60, 88, 29, 34, 15, 35, 65};
        Map<Integer,Integer> m = new HashMap<>();

        for(int i=0;i<=array1.length-1;i++){
            if(m.get(array1[i])!=null){
                int count = m.get(array1[i]);
                m.put(array1[i],count);
            }
            else{
                m.put(array1[i],1);
            }
        }

        for(int i=0;i<=array2.length-1;i++){
            if(m.get(array2[i])!=null){
                System.out.println(array2[i]);
            }
        }
    }
}
