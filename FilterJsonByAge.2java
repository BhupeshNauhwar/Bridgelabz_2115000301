import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

public class FilterJsonByAge {
    public static void main(String[] args) throws Exception {
        String json = "[{\"name\":\"Alice\", \"age\":30}, {\"name\":\"Bob\", \"age\":25}, {\"name\":\"Charlie\", \"age\":35}]";

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode arrayNode = objectMapper.readTree(json);

        List<JsonNode> filteredList = new ArrayList<>();
        for (JsonNode node : arrayNode) {
            if (node.get("age").asInt() > 25) {
                filteredList.add(node);
            }
        }

        String filteredJson = objectMapper.writeValueAsString(filteredList);
        System.out.println(filteredJson);
    }
}
