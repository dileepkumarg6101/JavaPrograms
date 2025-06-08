package Pra.StreamApi;

import java.util.stream.IntStream;
//Check if the string is palindrome or not
public class PalindromeOrNot {
    public static void main(String[] args) {
        String str1 = "anantnana";

        boolean palindrome = IntStream.range(0, str1.length()/2)
                .noneMatch(i -> str1.charAt(i)!=str1.charAt(str1.length()-i-1));

        System.out.println("Is" +str1 +"palindrome? "+ palindrome);


    }
}
