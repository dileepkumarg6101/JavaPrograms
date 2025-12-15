package InfosysInternalProjectPrep.streamApis.notes;

public class CollectorsList {
}
/*
Here is the list of Java Collectors (as requested):

Collectors.toList()
Collectors.toSet()
Collectors.toMap()
Collectors.toCollection()
Collectors.joining()
Collectors.counting()
Collectors.collectingAndThen()
Collectors.maxBy()
Collectors.minBy()
Collectors.summingInt()
Collectors.summingLong()
Collectors.summingDouble()
Collectors.groupingBy()
Collectors.partitioningBy()
Collectors.averagingInt()
Collectors.averagingLong()
Collectors.averagingDouble()
Collectors.summarizingInt()
Collectors.summarizingLong()
Collectors.summarizingDouble()
 */
/*
// toList()
List<String> list = stream.collect(Collectors.toList());

// toSet()
Set<String> set = stream.collect(Collectors.toSet());

// toMap()
Map<Integer, String> map =
stream.collect(Collectors.toMap(Employee::getId, Employee::getName));

// toCollection()
LinkedList<String> ll =
stream.collect(Collectors.toCollection(LinkedList::new));

// joining()
String result =
stream.collect(Collectors.joining(", "));

// counting()
long count =
stream.collect(Collectors.counting());

// collectingAndThen()
List<String> unmodifiable =
stream.collect(Collectors.collectingAndThen(
    Collectors.toList(), Collections::unmodifiableList));

// maxBy()
Optional<Employee> max =
stream.collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));

// minBy()
Optional<Employee> min =
stream.collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));

// summingInt()
int sumInt =
stream.collect(Collectors.summingInt(Employee::getSalary));

// summingLong()
long sumLong =
stream.collect(Collectors.summingLong(Employee::getSalary));

// summingDouble()
double sumDouble =
stream.collect(Collectors.summingDouble(Employee::getSalary));

// groupingBy()
Map<String, List<Employee>> group =
stream.collect(Collectors.groupingBy(Employee::getDepartment));

// partitioningBy()
Map<Boolean, List<Employee>> partition =
stream.collect(Collectors.partitioningBy(e -> e.getAge() > 25));

// averagingInt()
double avgInt =
stream.collect(Collectors.averagingInt(Employee::getAge));

// averagingLong()
double avgLong =
stream.collect(Collectors.averagingLong(Employee::getSalary));

// averagingDouble()
double avgDouble =
stream.collect(Collectors.averagingDouble(Employee::getSalary));

// summarizingInt()
IntSummaryStatistics intStats =
stream.collect(Collectors.summarizingInt(Employee::getAge));

// summarizingLong()
LongSummaryStatistics longStats =
stream.collect(Collectors.summarizingLong(Employee::getSalary));

// summarizingDouble()
DoubleSummaryStatistics doubleStats =
stream.collect(Collectors.summarizingDouble(Employee::getSalary));

 */