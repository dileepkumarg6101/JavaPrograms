package JavaFullNotesPra.Collections;

import java.util.ArrayList;

public class First {
    public static void main(String[] args) {
//        ArrayList arrayList=new ArrayList();
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(Integer.valueOf("123"));
//        arrayList.add((int) 12.12);
        arrayList.add(Integer.valueOf('c'));
        System.out.println(arrayList);
    }
}
