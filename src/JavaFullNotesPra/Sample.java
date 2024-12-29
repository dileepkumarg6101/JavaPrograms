package JavaFullNotesPra;

public class Sample {
    
    public static  void div(){
        int a =10;
        int b=5;
        try {
            int c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println("Exception is ocurred and handled");
        }
    }

    public static void main(String[] args) {
        div();
    }
}
