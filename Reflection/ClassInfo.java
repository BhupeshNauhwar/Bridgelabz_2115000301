import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter class name (e.g., java.util.ArrayList): ");
        String className = scanner.nextLine();

        try {
            Class<?> cls = Class.forName(className);
            
            System.out.println("\nClass: " + cls.getName());

            System.out.println("\nConstructors:");
            for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
                System.out.println(constructor);
            }

            System.out.println("\nMethods:");
            for (Method method : cls.getDeclaredMethods()) {
                System.out.println(method);
            }

            System.out.println("\nFields:");
            for (Field field : cls.getDeclaredFields()) {
                System.out.println(field);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        } finally {
            scanner.close();
        }
    }
}
