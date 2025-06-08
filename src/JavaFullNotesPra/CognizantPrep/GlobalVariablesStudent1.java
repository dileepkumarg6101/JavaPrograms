package JavaFullNotesPra.CognizantPrep;

public class GlobalVariablesStudent1 {
    //static global variables
    static String college = "Qspiders";//global var
    static String stdname = "Rohan";//global var
    static int passingmarks = 60;//global var
    static int maxbacklogs = 12;//global var

    public static void main(String[] args) {
        System.out.println("Details from main method are:");
        System.out.println(college);
        System.out.println(stdname);
        System.out.println(passingmarks);
        System.out.println(maxbacklogs);
        displayDetails();


    }
    public static void displayDetails() {
        System.out.println("Details from display method are:");
        System.out.println("Name : "+stdname);
        System.out.println("College : "+college);
        System.out.println("Marks : "+passingmarks);
        System.out.println("AffordableBacks : "+maxbacklogs);

    }

}
