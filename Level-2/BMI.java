import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Weight in kg");
        float weight=sc.nextFloat();
        System.out.println("Enter height in cm");
        float height=sc.nextFloat()/100;
        float Bmi=weight/(height*height) ;
        if (Bmi<=18.4) {
            System.out.println("Underweight");
        } else if (Bmi>=18.5 && Bmi<=24.9) {
            System.out.println("Nomral");
        }
         else if (Bmi>=25 && Bmi<=39.9) {
            System.out.println("Overweight");
        }
         else if (Bmi>40) {
            System.out.println("Obese");
        }
        
    }
}
