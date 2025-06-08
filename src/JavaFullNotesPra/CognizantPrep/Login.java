package JavaFullNotesPra.CognizantPrep;
/*
METHODS WITH SOME INPUT A method can have any number of inputs in the form of arguments.
 */
public class Login {
    public static void main(String[] args) {
        register("Dileep", "dileepkumarg6101@gmail.com", "123456");

    }
    public static void register(String name, String email, String password) {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}
