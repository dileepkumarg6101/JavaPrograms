package JavaFullNotesPra;
/*
METHODS WITH SOME INPUT
------------------------------------------
-A method can have any number of inputs in the form of arguments.
-Ex: public static void add()//method with zero argument or 0 input
 public static void add(int i)//method with integer argument
-When we call any method with argument we have to pass that particular type of values.
-While passing arguments we have to make sure it will be as per sequence define in method declaration
 */
public class Login {
    public static void main(String[] args) {
        registration("Dileep","dileepkumarg6101@gmail.com",9581061206l);

    }
    public static  void registration(String name, String email, long phoneNumer){
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("PhoneNumer: "+phoneNumer);
    }
}
