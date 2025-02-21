import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {
        String sourceFile = "largefile.txt";
        String destinationFile = "copy_largefile.txt";
        
        long startTime, endTime;
        
        startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile))) {
            
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        endTime = System.nanoTime();
        System.out.println("Buffered Streams Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}
