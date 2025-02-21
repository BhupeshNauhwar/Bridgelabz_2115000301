import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        String filePath = "textfile.txt";
        
        Map<String, Integer> wordCount = new HashMap<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCount.entrySet());
        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        System.out.println("Top 5 most frequent words:");
        sortedWords.stream().limit(5).forEach(entry -> 
            System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
