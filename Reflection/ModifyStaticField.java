import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "OLD_KEY";

    public static String getApiKey() {
        return API_KEY;
    }
}

public class ModifyStaticField {
    public static void main(String[] args) {
        try {
            Field apiKeyField = Configuration.class.getDeclaredField("API_KEY");
            apiKeyField.setAccessible(true);
            
            System.out.println("Original API_KEY: " + Configuration.getApiKey());

            apiKeyField.set(null, "NEW_SECRET_KEY");
            System.out.println("Modified API_KEY: " + Configuration.getApiKey());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
