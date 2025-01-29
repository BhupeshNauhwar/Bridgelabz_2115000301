public class RemoveDuplicate {
    public static void main(String[] args) {
        String s="abdagea";
        String modified=removeDuplicate(s);
        for (int i = 0; i < modified.length(); i++) {
            System.out.print(modified.charAt(i));
        }
    }    
    public static String removeDuplicate(String s){
       StringBuilder result=new StringBuilder();
        for (int i = 0; i < s.length()-1; i++) {
                if (s.charAt(i)!=s.charAt(i+1)) {
                    result.append(s.charAt(i));
                }
            
        }
    return result.toString();    
    }
}
