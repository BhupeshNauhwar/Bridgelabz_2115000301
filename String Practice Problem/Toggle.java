import java.util.Scanner;

public class Toggle {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    
    StringBuilder toggle=new StringBuilder();
    for (char c:s.toCharArray()) {
        if (Character.isUpperCase(c)) {
            toggle.append(Character.toLowerCase(c));
        }else if (Character.isLowerCase(c)) {
            toggle.append(Character.toUpperCase(c));
        }
        else{
            toggle.append(c);
        }
    }
    System.out.println("String after toggle is "+toggle);
   } 
}
