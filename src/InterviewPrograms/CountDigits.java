package InterviewPrograms;

public class CountDigits {
    public static void main(String[] args) {
        int input = 29845315;
        int s1 = String.valueOf(input).length();
        System.out.println(s1);


        int count = 0;

        while (input != 0) {

            count++;
            input /= 10;
        }
        System.out.println(count);

// convert given number to string solutions to count digits in an integer........
        String s = Integer.toString(count);
        System.out.println(s);
    }
}


