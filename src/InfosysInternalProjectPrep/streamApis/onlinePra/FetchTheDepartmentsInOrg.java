package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.List;
/*
Query 3.2 : Print the name of all departments in the organization?
 */
public class FetchTheDepartmentsInOrg {
    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(
                new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0),
                new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0),
                new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0),
                new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0)

        );
        List<String> departments = employee.stream()
                .map(Employee::getDepartment)
                .distinct().toList();

        System.out.println(departments);

    }
}
