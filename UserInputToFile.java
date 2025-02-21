import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:");
        
        try (FileWriter writer = new FileWriter("user_data.txt")) {
            String name = reader.readLine();
            System.out.println("Enter your age:");
            String age = reader.readLine();
            System.out.println("Enter your favorite programming language:");
            String language = reader.readLine();
            
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");
            
            System.out.println("User data saved successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
