class Student {
    public int rollNumber;
    protected String name;
    private float CGPA;

    public Student(int rollNumber, String name, float CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public float getCGPA() {
        return CGPA;
    }

    public void setCGPA(float CGPA) {
        this.CGPA = CGPA;
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, float CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        displayStudentDetails();
        System.out.println("Specialization: " + specialization);
    }
}

public class UniversityMain {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice", 3.8f);
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 3.9f, "Machine Learning");

        student1.displayStudentDetails();
        pgStudent.displayPostgraduateDetails();

        student1.setCGPA(4.0f);
        System.out.println("Updated CGPA of " + student1.name + ": " + student1.getCGPA());
    }
}
