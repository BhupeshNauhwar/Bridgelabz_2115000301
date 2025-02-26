import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.ValidationMessage;
import java.util.Set;

public class ValidateJsonEmail {
    public static void main(String[] args) throws Exception {
        String json = "{\"email\": \"invalid-email\"}";
        String schemaStr = "{ \"type\": \"object\", \"properties\": { \"email\": { \"type\": \"string\", \"format\": \"email\" } }, \"required\": [\"email\"] }";

        ObjectMapper objectMapper = new ObjectMapper();
        JsonSchemaFactory schemaFactory = JsonSchemaFactory.getInstance();
        JsonSchema schema = schemaFactory.getSchema(schemaStr);
        JsonNode jsonNode = objectMapper.readTree(json);

        Set<ValidationMessage> errors = schema.validate(jsonNode);
        if (errors.isEmpty()) {
            System.out.println("Valid JSON");
        } else {
            System.out.println("Invalid JSON: " + errors);
        }
    }
}
