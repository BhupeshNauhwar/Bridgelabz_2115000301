import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String toggled = "";
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggled += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                toggled += Character.toUpperCase(c);
            } else {
                toggled += c;
            }
        }
        System.out.println("String after toggle is " + toggled);
    }
}
