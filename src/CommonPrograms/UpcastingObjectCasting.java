package CommonPrograms;

public class UpcastingObjectCasting {
    public void view()
    {
        System.out.println("Student details are :");
        System.out.println("Name:John P");
        System.out.println("MJCET");
        System.out.println("BTECH-Computer Science");
        System.out.println("Degree-58.3%\nINT-75%\nSSC-66%");
    }
}
class Admin extends UpcastingObjectCasting
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
