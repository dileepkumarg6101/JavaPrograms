package JavaFullNotesPra.CognizantPrep;

public class Student1 {
    String name;
    int age;
    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1("John", 20);
        Student1 s2 = new Student1("Jane", 22);

        System.out.println("Student 1: " + s1.name + ", Age: " + s1.age);
        System.out.println("Student 2: " + s2.name + ", Age: " + s2.age);

    }
}
