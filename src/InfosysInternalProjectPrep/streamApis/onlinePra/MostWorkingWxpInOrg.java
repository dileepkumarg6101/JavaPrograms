package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MostWorkingWxpInOrg {
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
        For this query, sort employeeList by yearOfJoining in natural order and first employee will have most working experience in the organization.
         To solve this query, we will be using sorted() and findFirst() methods of Stream.
         */

        Optional<Employee> result =  employee.stream()
                .sorted(Comparator.comparing(Employee::getYearOfJoining))
                .findFirst();
        System.out.println(result);
    }
}
