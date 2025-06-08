package InterviewPrograms;
/*
For example, if number = 5:

f = 1 * 1 = 1

f = 1 * 2 = 2

f = 2 * 3 = 6

f = 6 * 4 = 24

f = 24 * 5 = 120
 */
public class FactorialOfNumner {
    public static void main(String[] args) {
        int num=5, factorial =1;
        for (int i=1;i<=num;i++){
            factorial*=i;
        }
        System.out.println(factorial);

    }
}
