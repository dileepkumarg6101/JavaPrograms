package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
3.7) Collectors.maxBy() :
This method returns a Collector that collects largest element in a stream according to supplied Comparator.

Example : Collecting highest percentage.
 */
public class HighestPercentageStudent {
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
        // method1

        Optional<Student> higehstPercentage =  student.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Student::getPercentage)));

        System.out.println(higehstPercentage);

        // method 2:
        Optional<Double> hihestperc = student.stream()
                .map(Student::getPercentage)
                .collect(Collectors.maxBy(Comparator.naturalOrder()));

        System.out.println(hihestperc);

        // method3:
        Optional<Double> higehstPercent =  student.stream()
                .map(Student::getPercentage)
                .sorted(Comparator.reverseOrder())
                .limit(1)
                .findFirst();

        System.out.println("higehstPercent: "+ higehstPercent);



    }
}
