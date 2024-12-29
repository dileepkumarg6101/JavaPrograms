package Dsa;

/*
// Question: Given a sorted array of characters in ascending order,
 find the greatest character that is less than a given target character.
The target character is not present in the array. If there is no such element, return 'a'.
 */
public class GreatestCharacterFinder {
    public static char binarySearch(char[] character, char target) {
        char result = 'a';
        for (char ch : character) {
            if (ch < target) {
                result = ch;
            } else {
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        char[] characters = {'c', 'e', 'g', 'k', 'y'};
        char target = 'h';
        char result = binarySearch(characters, target);
        System.out.println(result);
    }
}
