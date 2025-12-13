package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.*;
import java.util.stream.Collectors;

/*
Query 3.7 : What is the average salary of each department?
 */
public class FindAvgSalaryInDept {
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
        Use the same method as in the above query 3.6, but here
        pass Collectors.averagingDouble(Employee::getSalary) as second argument to Collectors.groupingBy() method.

         */
        /*
        Map<String, Double> map = employee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(map);

         */
        // method: 2

        Map<String, Double> map = employee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(map);

        Set<Map.Entry<String, Double>> entrySet = map.entrySet();

        for (Map.Entry<String, Double> result : entrySet) {
            System.out.println(result.getKey() + " : " + result.getValue());
        }


    }
}
