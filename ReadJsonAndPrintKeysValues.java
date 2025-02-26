import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class ReadJsonAndPrintKeysValues {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(new File("data.json"));

        printJson(rootNode);
    }

    private static void printJson(JsonNode node) {
        if (node.isObject()) {
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } else if (node.isArray()) {
            for (JsonNode item : node) {
                printJson(item);
            }
        }
    }
}
