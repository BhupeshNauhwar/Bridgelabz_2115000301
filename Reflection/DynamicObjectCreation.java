
import java.lang.reflect.Constructor;
import java.lang.reflect.Method; 
class Student {
    private String name;
    
    public Student() {
        this.name = "Default Student";
    }

    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) {
        try {
            Class<?> studentClass = Class.forName("Student");
            
            Constructor<?> constructor = studentClass.getConstructor(String.class);
            Object student = constructor.newInstance("Alice");

            Method displayMethod = studentClass.getMethod("display");
            displayMethod.invoke(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



