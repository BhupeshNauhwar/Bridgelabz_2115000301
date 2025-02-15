import java.io.*;

public class ConsoleToFileWriter {
    public static void main(String[] args) {
        String filePath = "user_input.txt";

        try (
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(fw)
        ) {
            System.out.println("Enter text (type 'exit' to stop):");

            String input;
            while (!(input = br.readLine()).equalsIgnoreCase("exit")) {
                bw.write(input);
                bw.newLine();
            }
            System.out.println("Data successfully written to " + filePath);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
