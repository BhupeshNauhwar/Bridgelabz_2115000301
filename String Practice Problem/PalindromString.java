
public class PalindromString {
    public static void main(String[] args) {
        String s="ababba";
        // String s="abbabba";
        if (checkPalindrom(s)) {
            System.out.println("Given string is pailndrome");
        }else{
            System.out.println("Given string is not pailndrome");
        }
    }
    public static boolean checkPalindrom(String s){
        int start=0;
        int end=s.length()-1;
        while (start<end) {
            if (s.charAt(start)!=s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
    return true;    
    }     
}
