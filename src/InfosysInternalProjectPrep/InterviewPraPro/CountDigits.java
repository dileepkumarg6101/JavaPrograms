package InfosysInternalProjectPrep.InterviewPraPro;

public class CountDigits {
    public static void main(String[] args) {
        int num = 123456789;
        int count = 0;
        int length = String.valueOf(num).length();
        System.out.println("checking the length: " + length);

        // count the number of digits

        while (num != 0) {
            count++;
            num /= 10;
        }
        System.out.println("final count of number: " + count);

// convert given number to string solutions to count digits in an integer........

        String s = Integer.toString(count);
        System.out.println("converted number to string: " + s);


    }
}
