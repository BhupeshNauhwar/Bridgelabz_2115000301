import java.io.*;

public class ByteToCharStream {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\asus\\Desktop\\Capegmini_Training\\example.txt";

        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("Error: File not found at " + filePath);
            return;
        } 

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
