import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethod {
    String level() default "HIGH";
}

class ProcessManager {
    @ImportantMethod
    void startProcess() {
        System.out.println("Starting the process...");
    }

    @ImportantMethod(level = "MEDIUM")
    void stopProcess() {
        System.out.println("Stopping the process...");
    }

    void normalMethod() {
        System.out.println("This is a normal method.");
    }
}

public class ImportantMethodExample {
    public static void main(String[] args) {
        Method[] methods = ProcessManager.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + " | Importance Level: " + annotation.level());
            }
        }
    }
}
