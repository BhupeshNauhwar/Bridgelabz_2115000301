public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        int iterations = 1_000_000;

        StringBuffer sbf = new StringBuffer();
        long startTime1 = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbf.append("hello");
        }
        long endTime1 = System.nanoTime();
        long bufferTime = endTime1 - startTime1;

        StringBuilder sbd = new StringBuilder();
        long startTime2 = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbd.append("hello");
        }
        long endTime2 = System.nanoTime();
        long builderTime = endTime2 - startTime2;

        System.out.println("Time taken by StringBuffer: " + bufferTime / 1_000_000 + " ms");
        System.out.println("Time taken by StringBuilder: " + builderTime / 1_000_000 + " ms");
    }
}
