import java.io.*;

public class ImageToByteArray {
    public static void main(String[] args) {
        String inputImagePath = "input.jpg";
        String outputImagePath = "output.jpg";
        
        byte[] imageData = readImageToByteArray(inputImagePath);
        if (imageData != null) {
            writeByteArrayToImage(imageData, outputImagePath);
            System.out.println("Image successfully converted to byte array and written back to file.");
        }
    }

    private static byte[] readImageToByteArray(String imagePath) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             FileInputStream fis = new FileInputStream(imagePath)) {
            
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the image: " + e.getMessage());
            return null;
        }
    }

    private static void writeByteArrayToImage(byte[] imageData, String imagePath) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
             FileOutputStream fos = new FileOutputStream(imagePath)) {
            
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing the image: " + e.getMessage());
        }
    }
}
