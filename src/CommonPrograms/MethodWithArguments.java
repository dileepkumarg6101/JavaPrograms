package CommonPrograms;

public class MethodWithArguments {

    public static void main(String[] args){
        registration("Dileep","dileepkumarg6101@gmail.com",9581061206l);
    }
    public static void registration(String name, String email,long number){
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Mobie Number: "+number);
    }
}

