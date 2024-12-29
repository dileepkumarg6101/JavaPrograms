package JavaFullNotesPra.Collections;

import java.util.HashMap;

public class One {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Dileep",26);
        hashMap.put("madhu",24);
        System.out.println(hashMap);
        System.out.println(hashMap.values());
        hashMap.get(26);
    }
}
