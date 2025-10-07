package InfosysInternalProjectPrep.InterviewPraPro;

import java.util.HashMap;
import java.util.LinkedHashMap;
/*
D -1
i- 1
l-1
e-2
p-1
 */
public class FrequencyCalculator {
    public static void main(String[] args) {
        String s = "Dileep";

        LinkedHashMap<Character, Integer> freq = new LinkedHashMap<>();

        for (char ch: s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0)+1 );

        }
        System.out.println(freq );



    }

}
