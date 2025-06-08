package Pra;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreamApi {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Dileep", 10000.0));
        employeeList.add(new Employee("Dilkush", 20000.0));
        employeeList.add(new Employee("Dinesh", 30000.0));

        List<Employee> employee = employeeList.stream()
                .filter(e -> e.getSalary() > 20000.0)
                .collect(Collectors.toList());


        employee.forEach(emp -> System.out.println(emp.getEmployeName() + "-" + emp.getSalary()));

    }

}
