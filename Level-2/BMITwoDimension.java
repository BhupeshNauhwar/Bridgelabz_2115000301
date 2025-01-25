import java.util.Scanner;

public class BMITwoDimension {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();

        double person[][]=new double[num][3];
        String status[]=new String[num];
        for (int i = 0; i < person.length; i++) {
            
               while (true) {
                System.out.println("Enter height in cm of person"+(i+1));
                person[i][0]=sc.nextDouble();
                if ( person[i][0]<0) {
                    System.out.println("Enter Postive value");
                }
                else{
                  break;
                }
               }
                while (true) {
                  System.out.println("Enter weight in kg of person"+(i+1));
                  person[i][1]=sc.nextDouble();
                  if ( person[i][1]<0) {
                     System.out.println("Enter Postive value");
                 }
                 else{
                  break;
                 }
                }
        }
        for (int i = 0; i < person.length; i++) {
           double heightMeters=person[i][0]/100;
           person[i][2]=person[i][1]/(heightMeters*heightMeters);
           
            if (person[i][2]<18.4) {
               status[i]="Underweight";
            }else if (person[i][2]>=18.5&& person[i][2]<=24.9) {
               status[i]="Normal";
            }   
            else if (person[i][2]>=25&& person[i][2]<=39.9) {
               status[i]="Overweight";
            }   else{
               status[i]="Obese";
            }
           }
        
        for (int i = 0; i < person.length; i++) {
            System.out.println("Details of player "+(i+1));
            System.out.println("Height is "+person[i][0]);
            System.out.println("Weight is "+person[i][1]);
            System.out.println("BMI is "+person[i][2]);
            System.out.println("Status is "+status[i]+"\n");
        }
        
    }

}
