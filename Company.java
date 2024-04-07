import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
  public static void main(String[] args) {
    Employee[] Employees = new Employee[5];

    Employees[0] = new Manager("Michael Scott", 11340.12, 0);
    Employees[1] = new Worker("Dwight Schrute", 5759.86, "Salesman");
    Employees[2] = new Employee("Jim Halpert", 5500.0);
    Employees[3] = new Employee("Pam Beesly", 4976.50);
    Employees[4] = new Worker("Kevin Malone", 5230.92, "Accounting");

    int count = 0;
    for (Employee employee : Employees) {
      if (!(employee instanceof Manager)) {
        count++;
      }
    }

    ((Manager) Employees[0]).setNumberOfSubordinates(count);
    Employees[0].setSalary(7500);

    for (Employee employee : Employees) {
      System.out.println(employee);
    }
  }
}
