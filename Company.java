public class Company {
  public static void main(String[] args) {
    Employee[] Employees = new Employee[5];

    Employees[0] = new Employee("Jim Halpert", 5500.0);
    Employees[1] = new Employee("Dwight Schrute", 5759.86);
    Employees[2] = new Employee("Michael Scott", 11340.12);
    Employees[3] = new Employee("Pam Beesly", 4976.50);
    Employees[4] = new Employee("Kevin Malone", 5230.92);

    System.out.println(Employees[3]);

    Employees[3].setSalary(5844.36);

    for (Employee employee : Employees) {
      System.out.println(employee);
    }
  }
}
