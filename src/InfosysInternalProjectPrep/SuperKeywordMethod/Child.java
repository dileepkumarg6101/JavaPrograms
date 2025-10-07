package InfosysInternalProjectPrep.SuperKeywordMethod;

public class Child extends Parent{
    void display() {
        System.out.println("child display");
    }
    void  show(){
        display();
        super.display();
    }

}

