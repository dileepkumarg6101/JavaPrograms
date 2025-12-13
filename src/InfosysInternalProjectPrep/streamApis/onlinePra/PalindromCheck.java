package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.stream.IntStream;

/*
23) Palindrome program using Java 8 streams
 */
public class PalindromCheck {
    public static void main(String[] args) {

        String str = "ROTATOR";

        boolean palindrome =  IntStream.range(0, str.length() / 2)
                .noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));

        if (palindrome){
            System.out.println(str+" is a palindrome");

        }
        else {
            System.out.println(str+" is not a palindrome");

        }



    }
}
