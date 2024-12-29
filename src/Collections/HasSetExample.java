package Collections;

import java.util.HashSet;

public class HasSetExample {
    public static void main(String[] args) {
    HashSet<Integer> hashSet=new HashSet<>();
    hashSet.add(3);
    hashSet.add(1);
    hashSet.add(8);
    hashSet.remove(3);
        System.out.println(hashSet);
        if (hashSet.contains(3)){
            System.out.println("undi macha");
        }
        else {
            System.out.println("better luck next time");
        }
        System.out.println(hashSet.size());


}
}
