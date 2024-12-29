package JavaFullNotesPra;

/*
.Create an APP which includes the method as
 */
public class QspidersLogin {
    public static void main(String[] args) {
        System.out.println(login("dileep1016", 12345));
        System.out.println(login("dileep1016", 123456));
    }

    public static boolean login(String userName, int password) {

        if (userName == "dileep1016" && password == 12345) {
            return true;
        } else {
            return false;

        }
    }
}
