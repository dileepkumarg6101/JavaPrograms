package CommonPrograms;
/*
Method Overriding -------------------
During Inheritance subclass has complete previlege to change the
(method)implementation of super class, this process is known as Method
Overriding.
 */
public class MethodOverriding {
    public static void main(String[] args){
        Parent parent=new Parent();
        parent.car();
        parent.carName();

        Son son=new Son();
        son.car();
        son.carName();
        Daughter daughter=new Daughter();
        daughter.car();
        daughter.carName();
    }

}

class Parent{
     public void car(){
        System.out.println("Blue color");
    }
    public void carName(){
        System.out.println("Blue honda");
    }
}
class Son extends Parent{
    public void car(){
        System.out.println("Black color");
    }
    public void carName(){
        System.out.println("Black honda");
    }
}
class Daughter extends Parent{
    public void car(){
        System.out.println("pink color");
    }
    public void carName(){
        System.out.println("pink honda");
    }
}
