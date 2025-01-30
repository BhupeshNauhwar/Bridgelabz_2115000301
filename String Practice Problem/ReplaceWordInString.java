import java.util.Scanner;

public class ReplaceWordInString {
    public static String replaceWord(String str, String wordToReplace, String newWord) {
        String result = "";
        String word = "";
        str += " ";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (word.equals(wordToReplace)) {
                    result += newWord + " ";
                } else {
                    result += word + " ";
                }
                word = "";
            } else {
                word += str.charAt(i);
            }
        }
        return result.trim();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("Enter the word to replace and new word respectively:");
        String wordToReplace = input.next();
        String newWord = input.next();
        String modifiedString = replaceWord(str, wordToReplace, newWord);
        System.out.printf("Modified String: \"%s\"", modifiedString);
        input.close();
    }
}
