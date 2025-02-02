 class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {

    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Manager manager = new Manager("E123", "Sales", 50000.0);
        manager.displayEmployeeDetails();
        
        manager.setSalary(55000.0);
        System.out.println("Updated Salary: " + manager.getSalary());
    }
}
