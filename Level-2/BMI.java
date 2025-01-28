
import java.util.Scanner;
class Calculation{
    public double calculateBmi(double weight, double heightCm) {
        double heightM = heightCm / 100; 
        return weight / (heightM * heightM);
    }


    public String BMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}    
public class BMI {
    public static void main(String[] args) {
        Calculation cal=new Calculation();
        Scanner sc=new Scanner(System.in);
        int size=2;
        double Bmi[][]=new double[size][3];
        for (int i = 0; i < Bmi.length; i++) {
            System.out.println("Enter weight of "+(i+1)+" person");
            Bmi[i][0]=sc.nextDouble();
            System.out.println("Enter height of "+(i+1)+" person");
            Bmi[i][1]=sc.nextDouble();
            
        }
        for (int i = 0; i < Bmi.length; i++) {
            Bmi[i][2]=cal.calculateBmi(Bmi[i][0],Bmi[i][1]);
        }
        System.out.println("BMI Results:");
        for (int i = 0; i < size; i++) {
           
            System.out.println("Person "+(i+1)+" Bmi is "+Bmi[i][2]+" and status is "+cal.BMIStatus(Bmi[i][2]));
        }
        
        
    }    
}
