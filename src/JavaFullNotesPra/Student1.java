package JavaFullNotesPra;
/*
One of the drawbacks of no argument constructor is, it provides
same value for every object.
⦁ Therefore to overcome this drawback, we go for parameterized
constructor.
Parameterised Constructor
‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐
⦁ If a constructor contains any arguments, it is called as
parameterised constructor.
⦁ While creating Object, we have to pass particular argument as
constructor.
 */
public class Student1 {

//     declare the global variables
        String name;
        int age;
        // create a parametrized constructor
    public  Student1(String sname,int sage){
        name=sname;
        age=sage;
    }
        public static void main(String[] args) {
        Student1 s1=new Student1("Dileep",26);
            System.out.println(s1.name+" "+s1.age);

            Student1 s2=new Student1("Dilkush",25);
            System.out.println(s2.name+" "+s2.age);


        }
}
