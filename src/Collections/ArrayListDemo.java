package Collections;


//import java.util.ArrayList;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        ArrayList<Integer>temp=new ArrayList<>();
        temp.add(3);
        temp.add(5);
        arrayList.add(temp);


        ArrayList<Integer>temp2=new ArrayList<>();
        temp2.add(5);
        temp2.add(3);
        arrayList.add(temp2);

        System.out.println(arrayList);
        System.out.println(arrayList.size());

    }
}
