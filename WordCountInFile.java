import java.io.*;

public class WordCountInFile {
    public static void main(String[] args) {
        String filePath = "example.txt";
        String targetWord = "hello";
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        wordCount++;
                    }
                }
            }
            System.out.println("The word \"" + targetWord + "\" appears " + wordCount + " times in the file.");
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
