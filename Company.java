import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
  public static void main(String[] args) {
    Employee[] Employees = new Employee[7];

    Employees[0] = new Manager("Michael Scott", 11340.12, 0);
    Employees[1] = new Worker("Dwight Schrute", 5759.86, "Salesman");
    Employees[2] = new Employee("Jim Halpert", 5500.0);
    Employees[3] = new Employee("Pam Beesly", 4976.50);
    Employees[4] = new Worker("Kevin Malone", 5230.92, "Accounting");
    Employees[5] = new Manager("Andy Bernard", 11340.12, 0);
    Employees[6] = new Worker("Angela Martin", 5759.86, "Accounting");

    int count = 0;
    for (int i = 0; i < Employees.length; i++) {
      if (!(Employees[i] instanceof Manager)) {
        count++;
        Employees[i].setSalary(Employees[i].getSalary() + 500);
      }
    }

    ((Manager) Employees[0]).setNumberOfSubordinates(count);
    ((Manager) Employees[5]).setNumberOfSubordinates(count);
    Employees[0].setSalary(7500);
    Employees[5].setSalary(7500);

    for (Employee employee : Employees) {
      System.out.println(employee);
    }
  }
}
