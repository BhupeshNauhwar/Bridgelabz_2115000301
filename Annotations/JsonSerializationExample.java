import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@interface JsonField {
    String name();
}

class User {
    @JsonField(name = "user_name")
    private String username;
    
    @JsonField(name = "user_age")
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }
}

class JsonSerializer {
    static String serialize(Object obj) {
        try {
            Map<String, String> jsonMap = new HashMap<>();
            for (Field field : obj.getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(JsonField.class)) {
                    field.setAccessible(true);
                    String jsonKey = field.getAnnotation(JsonField.class).name();
                    Object value = field.get(obj);
                    jsonMap.put(jsonKey, value.toString());
                }
            }
            return jsonMap.toString().replace("=", ": "); 
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
    }
}

public class JsonSerializationExample {
    public static void main(String[] args) {
        User user = new User("Alice", 25);
        String json = JsonSerializer.serialize(user);
        System.out.println("Serialized JSON: " + json);
    }
}
