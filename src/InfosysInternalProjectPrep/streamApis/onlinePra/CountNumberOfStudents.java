package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;
/*
3.6) Collectors.counting() :
It returns a Collector that counts number of input elements.

Example : Counting number of students.
 */
public class CountNumberOfStudents {
    public static void main(String[] args) {
        List<Student> student = Arrays.asList(
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
        Long countStudents = student.stream()
                .collect(Collectors.counting());
        System.out.println(countStudents);

    }
}
