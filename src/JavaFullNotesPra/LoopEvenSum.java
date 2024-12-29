package JavaFullNotesPra;
/*
5.WAP to print sum of all even numbers from 1 to 15
 */
public class LoopEvenSum {
    public static void main(String[] args) {
        int sum=0;
        for (int i=0;i<=15;i++){
            if (i%2==0){
                sum+=i;
//                System.out.println(sum);
            }
        }
        System.out.println(sum);

    }
}
