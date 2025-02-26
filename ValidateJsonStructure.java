import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJsonStructure {
    public static void main(String[] args) {
        String json = "{\"name\": \"John\", \"age\": 25}";

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.readTree(json);
            System.out.println("Valid JSON");
        } catch (Exception e) {
            System.out.println("Invalid JSON: " + e.getMessage());
        }
    }
}
