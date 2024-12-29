package InterviewIfosys;
/*
Q2
"Good Morning Dileep"
Print all the chars and its occurrence
Ans: g-1
0-3
d-2
m-1
 */
import java.util.HashMap;
import java.util.Map;

public class Rahul2 {
    public static void main(String[] args) {
        String s="Good Morning Dileep";
        Map<Character,Integer> m = new HashMap<>();

        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)==' ')
                continue;
            if(m.get(s.charAt(i))!=null){
                int count = m.get(s.charAt(i))+1;
                m.put(s.charAt(i),count);
            }
            else{
                m.put(s.charAt(i),1);
            }
        }
        for(Character c:m.keySet()){
            System.out.println(c+" - "+m.get(c));
        }
    }
}
