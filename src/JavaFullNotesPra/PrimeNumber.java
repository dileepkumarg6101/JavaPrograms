package JavaFullNotesPra;

/*
13.WAP to check whether number 13 is prime number or not
 */
public class PrimeNumber {
    public static void main(String[] args) {

        int number = 13;
        boolean flag=true;
        for (int i=2; i<number;i++){
            if (number%i==0){
                flag=false;
                break;
            }

        }
        if (flag){
            System.out.println("Prime number");
        }
        else {
            System.out.println("not a prime number");
        }
    }


}
