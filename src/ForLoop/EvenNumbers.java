package ForLoop;

//4.WAP to print all even numbers from 1 to 30
public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}