package JavaFullNotesPra.CognizantPrep;

public class LoopEvenSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }


        }
        System.out.println(sum);
    }

}
