package employees;

public class Manager extends Employee {
  public int numberOfSubordinates;

  public Manager(String fullName, double salary, int numberOfSubordinates) {
    super(fullName, salary);

    this.numberOfSubordinates = numberOfSubordinates;
  }

  public int getNumberOfSubordinates() {
    return this.numberOfSubordinates;
  }

  public void setNumberOfSubordinates(int numberOfSubordinates) {
    this.numberOfSubordinates = numberOfSubordinates;
  }

  public String toString() {
    return String.format("Manager: %s, Salary: %f, Subordinates: %d", this.getName(), this.getSalary(),
        this.getNumberOfSubordinates());
  }
}
