import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {
}

class Service {
    public void execute() {
        System.out.println("Service Executed!");
    }
}

class Client {
    @Inject
    private Service service;

    public void run() {
        service.execute();
    }
}

public class DependencyInjection {
    public static void main(String[] args) {
        Client client = new Client();
        injectDependencies(client);
        client.run();
    }

    public static void injectDependencies(Object obj) {
        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(Inject.class)) {
                    field.setAccessible(true);
                    field.set(obj, field.getType().getDeclaredConstructor().newInstance());
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
