package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.*;

/*
Query 3.8 : Get the details of youngest male employee in the product development department?
 */
public class YongestDev {
    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(
                new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0),
                new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0),
                new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0),
                new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0),
                new Employee(100, "Dileep Kumar", 22, "Male", "Product Development", 2014, 32500.0),
                new Employee(66, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0),
                new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0)

        );
        /*
        For this query, use Stream.filter() method to filter male employees in product development department and
        to find youngest among them, use Stream.min() method.
         */

        Optional<Employee> map = employee.stream()
                .filter(e -> e.getGender()== "Male" && e.getDepartment() == "Product Development")
                .min(Comparator.comparingInt(Employee::getAge));

        System.out.println(map);



    }
}
