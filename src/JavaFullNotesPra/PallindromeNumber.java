package JavaFullNotesPra;
/*
 Pallindrome Number : if we reverse number we should get original number. For ex: 121,111,1221
6.WAP to check whether your number is pallindrome or not
 */
public class PallindromeNumber {
    public static void main(String[] args) {
        int number=121;
        int rev=0;
        int temp=number;
        int reminder=0;
        while(number!=0){
            reminder=number%10;
            number=number/10;
            rev=rev*10+reminder;
        }
        if (temp==rev){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }


    }
}
