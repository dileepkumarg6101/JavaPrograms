package CommonPrograms;

public class Downcasting {
    public void view()
    {
//Ex-1
        System.out.println("Student details are :");
        System.out.println("Name:John P");
        System.out.println("MJCET");
        System.out.println("BTECH-Computer Science");
        System.out.println("Degree-58.3%\nINT-75%\nSSC-66%");
    }
}

class Admin1 extends Downcasting
{
    public void edit()
    {
        System.out.println("Edit details of Student");
        System.out.println("Name:John P");
        System.out.println("MJCET");
        System.out.println("BTECH-Computer Science");
        System.out.println("Degree-60.9%\nINT-75%\nSSC-66%");
    }
}
class MainApp
{
    public static void main(String args[])
    {
        //upcasted object
        Downcasting s1 = new Admin1();
        s1.view();
        //s1.edit();//CTE

        //downcasted object
        Admin1 a1 = (Admin1) s1; //Admin a1 = new Admin()
        a1.edit();
        a1.view();
    }
}
