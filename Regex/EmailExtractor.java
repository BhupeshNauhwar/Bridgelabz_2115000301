import java.util.*;
import java.util.regex.*;

public class EmailExtractor {
    public static List<String> extractEmails(String text) {
        List<String> emails = new ArrayList<>();
        Matcher matcher = Pattern.compile("[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+").matcher(text);
        while (matcher.find()) emails.add(matcher.group());
        return emails;
    }

    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";
        extractEmails(text).forEach(System.out::println);
    }
}

