package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
12) Java 8 program to check if two strings are anagrams or not?
 */
public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";

        Boolean result = Arrays.stream(s1.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.joining())
                .equals(
                        Arrays.stream(s2.toLowerCase().split(""))
                                .sorted()
                                .collect(Collectors.joining())

                );

        System.out.println(result);



    }
}
