package JavaFullNotesPra.CognizantPrep;
// .WAP to print product of all even numbers from 1 to 10
public class LoopEvenProduct {
    public static void main(String[] args) {
        int product = 1;
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0) {
                product = product * i;
            }
        }
        System.out.println(product);


    }
}
