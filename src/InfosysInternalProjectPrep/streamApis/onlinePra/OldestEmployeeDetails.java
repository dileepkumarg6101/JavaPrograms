package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
Query 3.15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
 */
public class OldestEmployeeDetails {
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

        Optional<Employee> result =  employee.stream()
                .max(Comparator.comparingInt(Employee::getAge));

        Employee employeeList = result.get();

        System.out.println("Name : "+ employeeList.getName());
        System.out.println("Age : "+ employeeList.getAge());
        System.out.println("Department : "+ employeeList.getDepartment());
    }
}
