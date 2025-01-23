import java.util.Scanner;

public class HeightAndAges {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age of Amar");
        int ageAmar=sc.nextInt();
        System.out.println("Enter height of Amar");
        float heightAmar=sc.nextFloat();
        System.out.println("Enter age of Akbar");
        int ageAkbar=sc.nextInt();
        System.out.println("Enter height of Akbar");
        float heightAkbar=sc.nextFloat();
        System.out.println("Enter age of Anthony");
        int ageAnthony=sc.nextInt();
        System.out.println("Enter height of Anthony");
        float heightAnthony=sc.nextFloat();

        if(ageAkbar>ageAmar){
            if (ageAmar>ageAnthony) {
                System.out.println("Youngest friends among Akbar, Amar,Anthony is Anthony" );
            } else {
                System.out.println("Youngest friends among Akbar, Amar,Anthony is Amar" );
            }
        }else{
            if(ageAkbar>ageAnthony) {
                System.out.println("Youngest friends among Akbar, Amar,Anthony is Anthony" );
            }else {
                System.out.println("Youngest friends among Akbar, Amar,Anthony is Akbar" );
            }
        }

        if(heightAkbar>heightAmar){
            if (heightAkbar>heightAnthony){
                System.out.println("Tallest friends among Akbar, Amar,Anthony is Akbar" );
            } else {
                System.out.println("Tallest friends among Akbar, Amar,Anthony is Anthony" );
            }
        }else{
            if(heightAmar>heightAnthony) {
                System.out.println("Tallest friends among Akbar, Amar,Anthony is Amar" );
            }else {
                System.out.println("Tallest friends among Akbar, Amar,Anthony is Anthony" );
            }
        }

    }
}
