package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Query 3.11 : What is the average salary of male and female employees?
 */
public class AvgSalaryMaleAndFemaleEmp {
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
        This query is same as query 3.3 where you have found average age of male and female employees.
         Here, we will be finding average salary of male and female employees.
         */
         Map<String, Double> result = employee.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(result);





    }
}
