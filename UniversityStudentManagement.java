class Student{
    private static String universityName="GLA University";
    private static int totalStudents=0;
    
    private final int rollNumber;
    private String name;
    private char grade;
    
    public Student(int rollNumber, String name, char grade){
        this.rollNumber=rollNumber;
        this.name=name;
        this.grade=grade;
        totalStudents++;
    }

    public static void displayTotalStudnets(){
        System.out.println("Total Students: "+totalStudents);
    }
    public void display(){
        System.out.println("University Name:"+universityName);
        System.out.println("Roll Number:"+rollNumber);
        System.out.println("Student Name:"+name);
        System.out.println("Grade:"+grade+"\n");
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student s1=new Student(1234, "ABC", 'A');

        Student.displayTotalStudnets();
        if (s1 instanceof Student) {
            s1.display();
        }
        Student s2=new Student(1235, "XYZ", 'B');
        
        Student.displayTotalStudnets();
        if (s2 instanceof Student) {
            s2.display();
        }
    }
}
