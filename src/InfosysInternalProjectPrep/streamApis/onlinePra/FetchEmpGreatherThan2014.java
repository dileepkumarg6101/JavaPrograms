package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Query 3.5 : Get the names of all employees who have joined after 2015?
 */
public class FetchEmpGreatherThan2014 {
    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(
                new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0),
                new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0),
                new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0),
                new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0),
                new Employee(66, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0),
                new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0)

        );
        /*
        For such queries which require filtering of input elements, use Stream.filter() method
         which filters input elements according to supplied Predicate.
         */
        List<String> employeesGreatherThan2014 = employee.stream()
                .filter(s -> s.yearOfJoining >= 2014)
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(employeesGreatherThan2014);


    }
}
