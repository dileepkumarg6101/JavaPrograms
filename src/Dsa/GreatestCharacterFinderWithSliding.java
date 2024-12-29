package Dsa;

/*
// Question: Given a sorted array of characters in ascending order,
 find the greatest character that is less than a given target character.
The target character is not present in the array. If there is no such element, return 'a'.
 */
public class GreatestCharacterFinderWithSliding {
    public static char binarySearch(char[] character, char target) {
        int l = 0;
        int r = character.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (character[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        if (r == -1) {
            return 'a';
        }
        return character[r];
    }

    public static void main(String[] args) {
        char[] characters = {'c', 'e', 'g', 'k', 'y'};
        System.out.println(binarySearch(characters, 'b'));
    }
}
