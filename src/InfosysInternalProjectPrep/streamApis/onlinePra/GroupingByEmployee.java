package InfosysInternalProjectPrep.streamApis.onlinePra;
/*
problem: Group Employees by Age using Java Stream..
 */

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee1 {
    private int id;
    private String name;
    private int age;

    public Employee1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class GroupingByEmployee {
    public static void main(String[] args) {
        List<Employee1> names = List.of(
                new Employee1(1, "dileep", 26),
                new Employee1(2, "geethika", 25),
                new Employee1(3, "madhu", 24)

        );

        Map<Integer, List<Employee1>> map = names.stream()
                .collect(Collectors.groupingBy(employee -> employee.getAge()));

        map.forEach((key, value) -> {
            System.out.println("Age:" + key);
            System.out.println("List of employees: "+ value);
        });



    }
}
