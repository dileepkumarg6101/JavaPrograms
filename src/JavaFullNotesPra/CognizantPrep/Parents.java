package JavaFullNotesPra.CognizantPrep;
/*
ethod Overriding -------------------
During Inheritance subclass has complete previlege to change the
(method)implementation of super class, this process is known as Method
Overriding.
 */
public class Parents {
    public void car() {
        System.out.println("hundai");
    }
    public void carName() {
        System.out.println("black");
    }

}
class Son extends Parents {
    public void car() {
        System.out.println("audi");
    }
    public void carName() {
        System.out.println("red");
    }

}
class Daughter extends Parents {
    public void car() {
        System.out.println("bmw");
    }
    public void carName() {
        System.out.println("white");
    }

}
class Driver {
    public static void main(String[] args) {
        Parents p = new Parents();
        p.car();
        p.carName();

        Son s = new Son();
        s.car();
        s.carName();

        Daughter d = new Daughter();
        d.car();
        d.carName();
    }
}
