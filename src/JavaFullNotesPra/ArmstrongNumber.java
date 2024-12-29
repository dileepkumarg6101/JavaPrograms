package JavaFullNotesPra;
/*
 Armstrong Number : Any number we take individually add and cube it, we should get same number.
153--->1^3+5^3+3^3----->1+125+27=153
7.WAP to check whether your number is Armstrong or not
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        int number=153;
        int rem=0;
        int temp=number;
        int rev=0;
        while(number!=0){
            rem=number%10;
            number=number/10;
            rev=rev+(rem*rem*rem);
            System.out.println(rev);
        }
        if (temp==rev){
            System.out.println("amstrong:"+rev);
        }
        else {
            System.out.println("not a amstrong number");
        }


    }
}
