package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
Query 3.4 : Get the details of highest paid employee in the organization?
 */
public class FindHigestpaidEmployee {

    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(
                new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0),
                new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0),
                new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0),
                new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0)

        );
        /*
        Use Collectors.maxBy() method which returns maximum element wrapped in an Optional object
        based on supplied Comparator.
         */

        Optional<Employee> highestPaidEmployee = employee.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

        System.out.println(highestPaidEmployee);
    }
}
