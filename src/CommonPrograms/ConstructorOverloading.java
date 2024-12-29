package CommonPrograms;

public class ConstructorOverloading {

    String name,color,model;
    double price;

    public ConstructorOverloading(String name) {
        this.name = name;
    }
    public ConstructorOverloading(String name,String color) {
        this.name = name;
        this.color=color;
    }
    public ConstructorOverloading(String name,String color,String model,double price) {
        this.name = name;
        this.color=color;
        this.model=model;
        this.price=price;
    }

    public static void main(String[] args){
        ConstructorOverloading a1=new ConstructorOverloading("Dileep");
        System.out.println(a1.name);
        ConstructorOverloading a2=new ConstructorOverloading("Dileep","white");
        System.out.println("name: "+a2.name+" color: "+a2.color);
//        System.out.println(a2.color);
    }
}
