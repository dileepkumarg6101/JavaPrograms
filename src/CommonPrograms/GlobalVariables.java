package CommonPrograms;

public class GlobalVariables {
    //    final static String name = "prakash";
//    final static long number = 9989529543l;
//    final static String email = "prakashg6101@gmail.com";
    static String name;
    static long number;
    static String email;

    public static void details() {
        final String name = "Dileep";
        final long number = 9581061206l;
        final String email = "dileepkumarg6101@gmail.com";
        System.out.println(name);
        System.out.println(number);
        System.out.println(email);
    }

    public static void main(String[] args) {
        details();
        System.out.println(name);
        System.out.println(number);
        System.out.println(email);

    }

}
