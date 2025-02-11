import java.util.*;
class StudentNode{
		 int rollNumber;
		 String name;
		 int age;
		 char grade;

		StudentNode next;
		
		public StudentNode(int rollNumber, String name, int age, char grade){
			this.rollNumber=rollNumber;
			this.name=name;
			this.age=age;
			this.grade=grade;
			this.next=null;
		}
}

class StudentsOperations{
	private StudentNode head;
	
	public void addAtBegin(int rollNumber,String name, int age, char grade){
	
		StudentNode newStudent=new StudentNode(rollNumber,name,age,grade);
		newStudent.next=head;
		head=newStudent;
	}
	
	public void addAtLast(int rollNumber, String name, int age, char grade){
		StudentNode newStudent=new StudentNode(rollNumber,name,age,grade);
		if(head==null){
			head=newStudent;
			return;
		}
		StudentNode temp=head;
		
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=newStudent;
	}
	
	public void addAtPostion(int rollNumber,String name, int age, char grade, int position){
		StudentNode newStudent=new StudentNode(rollNumber,name,age,grade);
		if(position<1){
			System.out.println("Invalid Position");
			return;
		}
		if(position==1){
			addAtBegin(rollNumber,name, age, grade);
			return;
		}
		
		StudentNode temp=head;
		for(int i=1;temp!=null&&i<position-1;i++){
			temp=temp.next;
		}
		if(temp==null){
			System.out.println("Position out of range");
			return;
		}
		newStudent.next=temp.next;
		temp.next=newStudent;
	}
	
	public void deleteByRollNumber(int rollNumber){
		if(head==null){
			System.out.println("Not found");
			return;
		}
		if(head.rollNumber==rollNumber){
			head=head.next;
			return;
		}
		
		StudentNode temp=head;
		
		while(temp.next!=null && temp.next.rollNumber!=rollNumber){
			temp=temp.next;
			
		}
		if(temp.next==null){
			System.out.println("Not found");
			return;
		}
		temp.next=temp.next.next;
	}
	public void search(int rollNumber){
		StudentNode temp=head;
		while(temp!=null){
			if(temp.rollNumber==rollNumber){
				System.out.println("Found:"+temp.name+", age:"+temp.age+", grade:"+temp.grade );
				return;
			}
			temp=temp.next;
		}
		System.out.println("Not found");
	}
	public void updateGrade(int rollNumber,char newGrade){
		StudentNode temp=head;
		while(temp!=null){
			if(temp.rollNumber==rollNumber){
				temp.grade=newGrade;
				System.out.println("Grade updated " );
				return;
			}
			temp=temp.next;
		}
		System.out.println("Not found");
	}
	public void display(){
		StudentNode temp=head;
		while(temp!=null){
			System.out.println("Roll Number:"+temp.rollNumber);
			System.out.println("Name:"+temp.name);
			System.out.println("Age:"+temp.age);
			System.out.println("Grade:"+temp.grade);
			temp=temp.next;
		}
		
	}
}

public class StudentRecordManagement {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        StudentsOperations operations = new StudentsOperations();

        int options;

        do {
            System.out.println("1. Add Student at beginning");
            System.out.println("2. Add Student at End");
            System.out.println("3. Add Student at position");
            System.out.println("4. Delete students by Roll Number");
            System.out.println("5. Search students by Roll Number");
            System.out.println("6. Update Student Grade");
            System.out.println("7. Display all Students");
            System.out.println("8. Exit");
            
            options = sc.nextInt();
            sc.nextLine(); 

            switch (options) {
                case 1:
                    System.out.println("Enter Roll Number, Name, Age, Grade:");
                    int roll1 = sc.nextInt();
                    sc.nextLine();
                    String name1 = sc.nextLine();
                    int age1 = sc.nextInt();
                    sc.nextLine(); 
                    char grade1 = sc.next().charAt(0);
                    operations.addAtBegin(roll1, name1, age1, grade1);
                    break;

                case 2:
                    System.out.println("Enter Roll Number, Name, Age, Grade:");
                    int roll2 = sc.nextInt();
                    sc.nextLine(); 
                    String name2 = sc.nextLine();
                    int age2 = sc.nextInt();
                    sc.nextLine(); 
                    char grade2 = sc.next().charAt(0);
                    operations.addAtLast(roll2, name2, age2, grade2);
                    break;

                case 3:
                    System.out.println("Enter Roll Number, Name, Age, Grade, and Position:");
                    int roll3 = sc.nextInt();
                    sc.nextLine(); 
                    String name3 = sc.nextLine();
                    int age3 = sc.nextInt();
                    sc.nextLine(); 
                    char grade3 = sc.next().charAt(0);
                    int position = sc.nextInt();
                    operations.addAtPostion(roll3, name3, age3, grade3, position);
                    break;

                case 4:
                    System.out.println("Enter Roll Number:");
                    operations.deleteByRollNumber(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Enter Roll Number:");
                    operations.search(sc.nextInt());
                    break;

                case 6:
                    System.out.println("Enter Roll Number and new Grade:");
                    int roll6 = sc.nextInt();
                    char newGrade = sc.next().charAt(0);
                    operations.updateGrade(roll6, newGrade);
                    break;

                case 7:
                    operations.display();
                    break;

                case 8:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (options != 8);

        sc.close(); 
    }
}
