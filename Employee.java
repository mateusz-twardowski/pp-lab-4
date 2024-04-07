public class Employee {
  private String fullName;
  private double salary;

  public Employee(String fullName, double salary) {
    this.fullName = fullName;
    this.salary = salary;
  }

  public String getName() {
    return this.fullName;
  }

  public double getSalary() {
    return this.salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String toString() {
    return String.format(" Employee: %s, Salary: %f.", this.getName(), this.getSalary());
  }
}
