package JavaFullNotesPra.CognizantPrep;

/*
No argument Constructor‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐If a constructor does not have any argument it is called as No argument
constructor
 */
public class Student {
    String name;

    public Student() {
        name = "Dileep";
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);

    }
}
