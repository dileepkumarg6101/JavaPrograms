package JavaFullNotesPra;

public class CarA {
     String brname="Audi";//static var
    int capacity=4;//non static var
    //non static
    public void details()
    {
        String color="Black";//local var
        long price=5500000l;//local var
        System.out.println("Car name : "+brname);
        System.out.println("Car capacity : "+capacity);
        System.out.println("Color is : "+color);
        System.out.println("Starting Price : "+price);
    }
    public static void  features(){
        CarA carA =new CarA();
        System.out.println(carA.capacity);
        carA.details();
    }

    public static void main(String[] args) {
        features();
    }
}
