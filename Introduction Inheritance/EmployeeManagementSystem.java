class Employee{
    public String name;
    public int id; 
    public float salary;
    
    public Employee(String name, int id, float salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void display(){
        System.out.println("Employee Id "+id+" name "+name+" with salary "+salary);
    }
}
class Manager extends Employee{

    private int teamSize;
    public Manager(String name,int id, float salary,int teamSize){
        super(name, id, salary);
        this.teamSize=teamSize;
    }

    public void display(){
        super.display();
        System.out.println("Manger with team size:"+teamSize+"\n");
    }
}
class Developer extends Employee{
    private String programmingLanguage;
    public Developer(String name, int id ,float salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage=programmingLanguage;
    }
    public void display(){
        super.display();
        System.out.println("Programming Language :"+programmingLanguage+"\n");
    }

}
class Intern extends Employee{
    public Intern(String name, int id ,float salary){
        super(name, id, salary);
    }

    public void display(){
        super.display();
        System.out.println("Intern\n");
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee manager=new Manager("Jhon", 123, 500000, 2);
        
        Employee developer = new Developer("Smith", 234, 350000, "Java");

        Employee intern=new Intern(
            "intern",456, 1000);
        

        manager.display();    
        developer.display();    
        intern.display();    
    }
}
