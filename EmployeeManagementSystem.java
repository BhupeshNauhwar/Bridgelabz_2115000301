import java.util.*;

abstract class Employee{
	private int employeeId;
	private String name;
	private float baseSalary;

	public Employee(int employeeId, String name, float baseSalary){
		this.employeeId=employeeId;
		this.name=name;
		this.baseSalary=baseSalary;
	}

	public int getEmployeeId(){
		return employeeId;

	}

	public String getName(){
		return name;
	} 

	public float getBaseSalary(){
		return baseSalary;
	}

	 
	public abstract float calculateSalary();
	
	void displayDetails(){
		System.out.println("Employee Id:"+employeeId);
		System.out.println("Name:"+name);
		System.out.println("Total Salary:"+calculateSalary());
	}
}

interface Department{
	void assignDepartment(String dept);
	String getDepartment();
}

class  FullTimeEmployee extends Employee implements Department{
	private float fixedSalary;
	private String department;
	

	public FullTimeEmployee(int employeeId, String name, float baseSalary, float fixedSalary){
		super(employeeId, name, baseSalary);
		this.fixedSalary=fixedSalary;
	}
	public  float  calculateSalary(){
		return  getBaseSalary()+fixedSalary;
	}
	public void assignDepartment(String dept){
		this.department=dept;
	}

	public String getDepartment(){
		return "Department:"+ department;
	}
}

class  PartTimeEmployee extends Employee implements Department{
        private int workingHours;
	private float perHour;
	private String department;

        PartTimeEmployee(int employeeId, String name, float baseSalary,  int workingHours, float perHour){
                super(employeeId, name, baseSalary);
                this.workingHours=workingHours;
				this.perHour=perHour;
        }
	public  float calculateSalary(){
		return  getBaseSalary()+(workingHours*perHour);
	}
	
	public void assignDepartment(String dept){
		this.department=dept;
	}

	public String getDepartment(){
		return "Department:"+department;
	}
}


public class EmployeeManagementSystem{
	public static void main(String args[]){
		List<Employee> employees=new ArrayList<>();

		FullTimeEmployee emp1=new FullTimeEmployee(123,"Akash", 30000,15000);
			emp1.assignDepartment("Developer");

		PartTimeEmployee emp2=new PartTimeEmployee(124,"Rohit", 10000,10,30);
		emp2.assignDepartment("Intern");
		
		employees.add(emp1);
		employees.add(emp2);

		for(Employee e:employees){
			e.displayDetails();
			if(e instanceof Department){
				System.out.println(((Department)e).getDepartment()+"\n");
			}
		
		}	 

	}
}

