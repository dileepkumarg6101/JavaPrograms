package WhileLoop;

public class ArmstrongOrNot {
    public static void main(String[] args) {
        int num = 151, rev = 0, rem, temp = num;
        while (num > 0) {
            rem = num % 10;
            rev =rev+ rem*rem*rem;
            num = num / 10;
        }
        System.out.println("Reverse of num is : " + rev);

        if (rev == temp) {
            System.out.println("Armstrong number: " + rev);
        } else {

            System.out.println("not a Armstrong number:" + rev);

        }
    }
}
