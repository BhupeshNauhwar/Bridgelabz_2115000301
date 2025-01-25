import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of players");
        int size=sc.nextInt();
        double height[]=new double[size];
        double weight[]=new double[size];
        double Bmi[]=new double[size];
        String status[]=new String[size];

        for (int i = 0; i < height.length; i++) {
            System.out.println("Enter Height of player "+(i+1)+" in cm");
            height[i]=sc.nextDouble();
            System.out.println("Enter weight of player "+(i+1)+" in Kg ");
            weight[i]=sc.nextDouble();
        }
        for (int i = 0; i < Bmi.length; i++) {
            double heightMeters=height[i]/100;
            Bmi[i]=weight[i]/(heightMeters*heightMeters);
        }
        for (int i = 0; i < status.length; i++) {
         if (Bmi[i]<18.4) {
            status[i]="Underweight";
         }else if (Bmi[i]>=18.5&& Bmi[i]<=24.9) {
            status[i]="Normal";
         }   
         else if (Bmi[i]>=25&& Bmi[i]<=39.9) {
            status[i]="Overweight";
         }   else{
            status[i]="Obese";
         }
        }
        for (int i = 0; i < height.length; i++) {
            System.out.println("Details of player "+(i+1));
            System.out.println("Height is "+height[i]);
            System.out.println("Weight is "+weight[i]);
            System.out.println("BMI is "+Bmi[i]);
            System.out.println("Status is "+status[i]+"\n");
        }
    }
}
