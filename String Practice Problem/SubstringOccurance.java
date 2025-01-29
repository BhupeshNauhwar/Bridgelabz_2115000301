public class SubstringOccurance {
    public static void main(String[] args) {
        String s="abdfghabdtrabd";
        String str="abd";
        int count=0;
        
        for (int i = 0; i <=s.length()-str.length(); i++) {
            System.out.println(i);
                if (s.substring(i,i+str.length()).equals(str)) {
                    count++;    
                }
        }
        System.out.println(" SubstringOccurence "+count);
       
    }
}
