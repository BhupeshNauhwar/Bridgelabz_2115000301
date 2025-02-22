public class SpaceNormalizer {
    public static String replaceMultipleSpaces(String text) {
        return text.replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        String input = "This   is  an   example   with  multiple    spaces.";
        System.out.println(replaceMultipleSpaces(input));
    }
}

