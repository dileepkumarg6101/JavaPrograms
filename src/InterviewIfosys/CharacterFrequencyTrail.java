package InterviewIfosys;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
Q2
"Good Morning Dileep"
Print all the chars and its occurrence
Ans: g-1
0-3
d-2
m-1
 */
public class CharacterFrequencyTrail {
    public static void main(String[] args) {
        String s="Good Morning Dileep";
        Map<Character,Integer> map=new LinkedHashMap<>();

        for (int i=0;i<=s.length()-1;i++){
            if (s.charAt(i)==' ')
                continue;
            if (map.get(s.charAt(i))!=null){
                int count= map.get(s.charAt(i))+1;
                map.put(s.charAt(i),count);

            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for (Character c:map.keySet()){

            System.out.println(c+"_"+map.get(c));
        }

    }
}
