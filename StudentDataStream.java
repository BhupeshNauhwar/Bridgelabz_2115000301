import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) {
        String filePath = "students.dat";
        
        
        writeStudentData(filePath);
        
        
        readStudentData(filePath);
    }

    private static void writeStudentData(String filePath) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(101);
            dos.writeUTF("Alice");
            dos.writeDouble(3.8);
            
            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(3.6);
            
            dos.writeInt(103);
            dos.writeUTF("Charlie");
            dos.writeDouble(3.9);
            
            System.out.println("Student data written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing data: " + e.getMessage());
        }
    }

    private static void readStudentData(String filePath) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            System.out.println("Reading student data:");
            
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                
                System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading data: " + e.getMessage());
        }
    }
}
