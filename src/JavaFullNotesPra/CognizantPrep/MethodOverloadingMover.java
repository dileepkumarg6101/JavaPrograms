package JavaFullNotesPra.CognizantPrep;

public class MethodOverloadingMover {
    public static void main(String[] args) {
        add();
        add(10, 20);
        add('a', 'b');

    }
    public static void add(){
        System.out.println(10+20);
    }
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void add(char a, char b){
        System.out.println(a+b);
    }
}
