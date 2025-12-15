package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
3.13) Collectors.partitioningBy() :
This method partitions the input elements according to supplied Predicate and returns a Map<Boolean, List<T>>. Under the true key, you will find elements which match given Predicate and under the false key, you will find the elements which doesn’t match given Predicate.

Example : Partitioning the students who got above 80.0% from who don’t.
 */
public class PartitionStudentsByPercentage {
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

        Map<Boolean, List<Student>> result = student.stream()
                .collect(Collectors.partitioningBy(e -> e.getPercentage()>80.00));

        System.out.println(result);



    }
}
