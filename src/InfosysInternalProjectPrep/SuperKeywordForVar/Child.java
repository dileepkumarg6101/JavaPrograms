package InfosysInternalProjectPrep.SuperKeywordForVar;
/*
1️⃣ Access Parent Class Variables (When hidden by child variables)

If child class has a variable with the same name as parent class, super helps access parent’s variable
 */
public class Child extends Parent{
    int num =200;
    void show(){
        System.out.println("by default its calling child class: "+num);
        System.out.println("Its calling super class: "+super.num);
    }
}
