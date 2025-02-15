import java.io.*;

public class PerformanceComparison {
    public static void main(String[] args) {
        compareStringBuilderAndStringBuffer();
        compareFileReaders("largefile.txt");
    }

    private static void compareStringBuilderAndStringBuffer() {
        int iterations = 1_000_000;
        String text = "hello";

        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) / 1_000_000 + " ms");

        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    private static void compareFileReaders(String filePath) {
        long startTime, endTime;
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            startTime = System.nanoTime();
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
            endTime = System.nanoTime();
            System.out.println("FileReader Word Count: " + wordCount);
            System.out.println("FileReader Time: " + (endTime - startTime) / 1_000_000 + " ms");
        } catch (IOException e) {
            System.out.println("Error reading file with FileReader: " + e.getMessage());
        }

        wordCount = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"))) {
            startTime = System.nanoTime();
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
            endTime = System.nanoTime();
            System.out.println("InputStreamReader Word Count: " + wordCount);
            System.out.println("InputStreamReader Time: " + (endTime - startTime) / 1_000_000 + " ms");
        } catch (IOException e) {
            System.out.println("Error reading file with InputStreamReader: " + e.getMessage());
        }
    }
}
