package InfosysInternalProjectPrep.streamApis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeesExample {

    static class Employee{
        String name;
        int salary;

        public Employee(String name, int salary){
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString(){
            return name+";"+salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Dileep", 100),
                new Employee("Geehika", 200),
                new Employee("madhu", 300)
        );

        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparingInt(s -> s.salary))
                .collect(Collectors.toList());
        System.out.println(sorted);
    }
}
