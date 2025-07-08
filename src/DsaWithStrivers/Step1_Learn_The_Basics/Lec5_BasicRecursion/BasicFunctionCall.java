package DsaWithStrivers.Step1_Learn_The_Basics.Lec5_BasicRecursion;

public class BasicFunctionCall {
    static int count = 0;

     static void f() {

         if (count == 3){
             return;
         }
         System.out.println(count);
         count++;
         f();
    }
    public static void main(String[] args) {
        f();
    }


}
