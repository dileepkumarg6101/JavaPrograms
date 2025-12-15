package InfosysInternalProjectPrep.streamApis.onlinePra;

public class Student {
        String name;
        int id;
        String subject;
        double percentage;

    public Student(String name, int id, String subject, double percentage) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", subject='" + subject + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
/*
List<Student> studentList = Arrays.asList(
    new Student("Paul", 11, "Economics", 78.9),
    new Student("Zevin", 12, "Computer Science", 91.2),
    new Student("Harish", 13, "History", 83.7),
    new Student("Xiano", 14, "Literature", 71.5),
    new Student("Soumya", 15, "Economics", 77.5),
    new Student("Asif", 16, "Mathematics", 89.4),
    new Student("Nihira", 17, "Computer Science", 84.6),
    new Student("Mitshu", 18, "History", 73.5),
    new Student("Vijay", 19, "Mathematics", 92.8),
    new Student("Harry", 20, "History", 71.9)
);

 */
