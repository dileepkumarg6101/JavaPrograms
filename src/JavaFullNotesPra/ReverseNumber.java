package JavaFullNotesPra;
/*
5.WAP to find reverse of a number
int num=123
 */
public class ReverseNumber {
    public static void main(String[] args) {

        int num=121;
        int rev=0;
        int rem=0;
        while(num!=0){
            rem=num%10;
            num=num/10;
            rev=rev*10+rem;
        }
        System.out.println(rev);
        }
}
