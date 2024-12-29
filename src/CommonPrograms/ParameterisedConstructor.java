package CommonPrograms;

public class ParameterisedConstructor {
    String name;
    int number;
    public ParameterisedConstructor(String name,int number) {
        this.name = name;
        this.number=number;
    }

    public static void main(String[] args){
        ParameterisedConstructor a1=new ParameterisedConstructor("Dileep",123);
        System.out.println(a1.name);
        System.out.println(a1.number);
        ParameterisedConstructor a2=new ParameterisedConstructor("Dilkush",321);
        System.out.println(a2.name);
        System.out.println(a2.number);
    }

}
