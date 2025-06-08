package JavaFullNotesPra.CognizantPrep;

/*
AS-A relation ship --------------------
• One class containing the reference of another class is called as HAS-A
relationship.
 */
public class Engine {
    public static void main(String[] args) {

    }
}

class Car {
    Engine e = new Engine();

    void start() {
        System.out.println("Engine started");
    }
}