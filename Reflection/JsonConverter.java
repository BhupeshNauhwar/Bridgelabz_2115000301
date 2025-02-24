import java.lang.reflect.Field;

class Person {
    private String firstName = "Bhupesh";
    private int age = 25;
}

public class JsonConverter {
    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder("{");
        Field[] fields = obj.getClass().getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            try {
                json.append("\"").append(fields[i].getName()).append("\":\"")
                        .append(fields[i].get(obj)).append("\"");
                if (i < fields.length - 1) {
                    json.append(", ");
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(toJson(person));
    }
}