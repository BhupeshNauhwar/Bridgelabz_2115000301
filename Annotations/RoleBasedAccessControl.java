import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface RoleAllowed {
    String value();
}

class SecureService {
    @RoleAllowed("ADMIN")
    void performAdminTask() {
        System.out.println("Admin task executed successfully!");
    }
}

class RoleBasedAccessControl {
    static void executeIfAllowed(Object obj, String methodName, String userRole) {
        try {
            Method method = obj.getClass().getMethod(methodName);
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                String requiredRole = method.getAnnotation(RoleAllowed.class).value();
                if (userRole.equals(requiredRole)) {
                    method.invoke(obj);
                } else {
                    System.out.println("Access Denied! Required role: " + requiredRole);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SecureService service = new SecureService();
        
        System.out.println("Trying with ADMIN role:");
        executeIfAllowed(service, "performAdminTask", "ADMIN");

        System.out.println("\nTrying with USER role:");
        executeIfAllowed(service, "performAdminTask", "USER");
    }
}
