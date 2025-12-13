package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Query 3.14 : Separate the employees who are younger or equal to 25 years
from those employees who are older than 25 years.
 */
public class EmployeeAgePartition {
    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(
                new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0),
                new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0),
                new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0),
                new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0),
                new Employee(100, "Dileep Kumar", 22, "Male", "Product Development", 2014, 32500.0),
                new Employee(66, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0),
                new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0),
                new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0),
                new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0)

        );
        /*
        For this query, we will be using Collectors.partitioningBy() method which separates
         input elements based on supplied Predicate.
         */

        Map<Boolean, List<String>> map =  employee.stream()
                .collect(Collectors.partitioningBy(e -> e.age > 25, Collectors.mapping(Employee::getName, Collectors.toList())));

        System.out.println("Age > 25 : " + map.get(true));
        System.out.println("Age <= 25 : " + map.get(false));


    }
}
