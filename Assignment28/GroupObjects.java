import java.util.*;
public class GroupObjects {
public static void main(String[] args) {
List<Employee> employees = Arrays.asList(
new Employee("Alice", "HR"),
new Employee("Bob", "IT"),
new Employee("Carol", "HR"),
new Employee("David", "IT"),
new Employee("Eve", "Finance")
);
Map<String, List<Employee>> groupedByDepartment=new HashMap<>();
for(Employee emp:employees){
groupedByDepartment.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
}
for (String dept:groupedByDepartment.keySet()){
System.out.println(dept+": "+groupedByDepartment.get(dept));
}
}
}
class Employee {
String name;
String department;
public Employee(String name, String department) {
this.name = name;
this.department = department;
}
public String toString() {
return name;
}
}

