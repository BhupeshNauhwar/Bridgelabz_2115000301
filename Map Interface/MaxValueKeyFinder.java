import java.util.*;

public class MaxValueKeyFinder {
    public static String findMaxKey(Map<String, Integer> map) {
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        Map<String, Integer> inputMap = Map.of("A", 10, "B", 20, "C", 15);
        System.out.println(findMaxKey(inputMap));
    }
}
