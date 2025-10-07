package InfosysInternalProjectPrep.SuperKeywordConstructor;

public class Child extends Parent{

    public Child(String name){
        super(name); // calling parents constructor
        System.out.println("Child constructor:" + name);
    }
}
