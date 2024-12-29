package JavaFullNotesPra;

public class Student {

    // Global variable with non-static
    String name;
    // will create a constructor
    public Student(){
        name="Dileep";
    }
    public static void main(String[] args) {

//        create an object for Student
        Student student=new Student();
        System.out.println(student.name);
        Student student1=new Student();
        System.out.println(student1.name);
        Student student2=new Student();
        System.out.println(student2.name);


    }


}
