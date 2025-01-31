 class Employee {
    private String  name;
    private int id;
    private double salary;

    public  Employee(String name, int id, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("Employee name "+name);
        System.out.println("Employee id "+id);
        System.out.println("Employee salary "+salary);
    }
    public String getName(){
        return name;
    }

}
public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1=new Employee("Bhupesh", 1, 23000.021);
        Employee emp2=new Employee("Naveen", 2, 25000.022);
        System.out.println("Details of "+emp1.getName());
        emp1.displayDetails();
        System.out.println();
        System.out.println("Details of "+emp2.getName());
        emp2.displayDetails();
    }
}
