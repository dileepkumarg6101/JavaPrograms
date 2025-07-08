package InterviewPrograms;
/*
Write a Java program to calculate the sum of the digits of a given number. For example, if the input is 555, the output should be 15
 */
public class SumOfDigits {
    public static void main(String[] args) {
        int input = 555;
        int sum = 0;
        while (input != 0) {
            int ld = input % 10;
            sum = sum + ld;
            input /= 10;

        }
        System.out.println(sum);
    }
}
