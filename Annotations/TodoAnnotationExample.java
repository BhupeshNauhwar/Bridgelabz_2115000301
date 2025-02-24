import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class FeatureDevelopment {
    @Todo(task = "Implement login functionality", assignedTo = "Alice", priority = "HIGH")
    void implementLogin() {
        System.out.println("Login feature development in progress...");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    void optimizeDatabase() {
        System.out.println("Database optimization in progress...");
    }

    @Todo(task = "Improve UI responsiveness", assignedTo = "Charlie", priority = "LOW")
    void improveUI() {
        System.out.println("UI improvement in progress...");
    }
}

public class TodoAnnotationExample {
    public static void main(String[] args) {
        Method[] methods = FeatureDevelopment.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Task: " + todo.task());
                System.out.println("Assigned To: " + todo.assignedTo());
                System.out.println("Priority: " + todo.priority());
                System.out.println("------------------------");
            }
        }
    }
}
