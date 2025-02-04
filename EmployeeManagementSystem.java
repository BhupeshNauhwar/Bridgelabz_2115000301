class Employee{
    private static String companyName="Capgemini";
    private static int totalEmployees=0;

    private final int id;
    private String name;
    private String designation;

    public Employee(int id, String name, String designation){
        this.id=id;
        this.name=name;
        this.designation=designation;
        totalEmployees++;
    }
    public static int getTotalEmployees(){
        return totalEmployees;
    }
    public void display(){
        System.out.println("Company Name: "+companyName);
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Designation: "+designation+"\n");
    }


}

public class EmployeeManagementSystem {

        public static void main(String[] args) {
            Employee emp1=new Employee(123, "Xyz", "anyalst");

            System.out.println("Total Employees: "+Employee.getTotalEmployees());
            if (emp1 instanceof Employee) {
                emp1.display();
            }
            Employee emp2=new Employee(124, "Xyz", "Inten");

            System.out.println("Total Employees: "+Employee.getTotalEmployees());
            if (emp2 instanceof Employee) {
                emp2.display();
            }


        }
    
}