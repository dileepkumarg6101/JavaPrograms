package JavaFullNotesPra.CognizantPrep;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=153;
        int rev=0;
        int temp=num;
        while (num!=0){
            int rem=num%10;
            num=num/10;
            rev=rev+(rem*rem*rem);
        }
        if (temp==rev){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not a Armstrong number");
        }

    }
}
