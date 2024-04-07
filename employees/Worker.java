package employees;

public class Worker extends Employee {
  public String position;

  public Worker(String fullName, double salary, String postion) {
    super(fullName, salary);

    this.position = postion;
  }

  public String getPosition() {
    return this.position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String toString() {
    return String.format("Worker: %s, Salary: %f, Position: %s", this.getName(), this.getSalary(),
        this.getPosition());
  }
}
