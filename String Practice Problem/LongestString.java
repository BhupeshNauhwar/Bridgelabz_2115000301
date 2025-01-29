import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Length of longest word in String is "+findLength(s));
    }    
    public static int findLength(String s){
        String words[]=s.split(" ");
        int max=0;
        
        for (String w : words) {
            max=Math.max(max, w.length());
        }

        return max;
    } 
}
