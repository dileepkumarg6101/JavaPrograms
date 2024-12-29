package JavaFullNotesPra;
/*
class SwapNum2 //without using third variable
int a=10,b=20;
 */
public class SwapNum2 {
    public static void main(String[] args) {
        int a=10,b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a is: "+a+" b is:"+b);


    }
}
