package InfosysInternalProjectPrep.streamApis.onlinePra;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
/*
Query 3.6 : Count the number of employees in each department?
 */
public class CountNoOfEmpInEachDept {
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
        This query is same as query 3.1 but here we are grouping the elements by department.
         */
/*
        Map<String, Long> map = employee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

        System.out.println(map);

 */
        // method: 2
        Map<String, Long> map = employee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

        Set<Map.Entry<String, Long>> entrySet = map.entrySet();
        for (Map.Entry<String, Long> result : entrySet){
            System.out.println(result.getKey()+": "+ result.getValue());
        }



    }
}
