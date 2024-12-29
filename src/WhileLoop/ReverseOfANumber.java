package WhileLoop;

//WAP to find reverse of a number 123
public class ReverseOfANumber {

    public static void main(String[] args) {
        int num = 123, rev = 0, rem;
        while (num > 0) {
            rem = num % 10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse of num is : "+rev);
    }
}
