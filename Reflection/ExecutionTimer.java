import java.lang.reflect.Method;

class Task {
    public void process() {
        for (int i = 0; i < 1000000; i++);
    }
}

public class ExecutionTimer {
    public static void main(String[] args) {
        try {
            Task task = new Task();
            Method method = Task.class.getMethod("process");

            long startTime = System.nanoTime();
            method.invoke(task);
            long endTime = System.nanoTime();

            System.out.println("Execution Time: " + (endTime - startTime) + " nanoseconds");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
