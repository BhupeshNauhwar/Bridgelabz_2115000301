
public class CountVowelsAndConsonant {
    public static void main(String[] args) {
        String s="awedw";
        int countVowel=0;
        int countConsonant=0;
        for (int i=0;i<s.length();i++) {
            if (isVowel(s.charAt(i))) {
                countVowel++;
            }else  {
                countConsonant++;
            }

        }
        System.out.println("Vowels in given string is "+countVowel);
        System.out.println("Consonants in given string is "+countConsonant);
        
    }
    public static boolean isVowel(char ch){
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u') {
                return true;
            }
        return false;    
    }
    
    
}