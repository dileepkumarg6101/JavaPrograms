package CommonPrograms;

public class MethodOverLoading {
    public static void main(String[] args) {
        add();
        add(100, 200);
        add(100, "Dileep");
        add('G', 'C');
    }
    private static void add() {
        System.out.println(10 + 20);

    }

    private static void add(int i, int i1) {
        System.out.println(i + i1);
    }

    private static void add(int i, String s) {
        System.out.println(i + s);
    }

    public static void add(char c, char d) {
        System.out.println(c + d);

    }

}


