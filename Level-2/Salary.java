import java.util.Scanner;

public class Salary{
    public static void main(String[] args) {
        int size=10;
        double salary[]=new double[size];
        double bonus[]=new double[size];
        double newSalary[]=new double[size];
        double experience[]=new double[size];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter salary");
        for (int i = 0; i < salary.length; i++) {
            salary[i]=sc.nextDouble();
            
        }
        System.out.println("Enter experience");
        for (int i = 0; i < experience.length; i++) {
            experience[i]=sc.nextDouble();
            
        }
        for (int i = 0; i < bonus.length; i++) {
            if (experience[i]>5) {
                bonus[i]=salary[i]*5/100;
            }else{
                bonus[i]=salary[i]*2/100;
            }
        }
        for (int i = 0; i <newSalary.length; i++) {
            newSalary[i]=salary[i]+bonus[i];
        }
        System.out.print("Old Salary:");
        for (int i = 0; i < salary.length; i++) {
            System.out.print(salary[i]+" ");
        }
        System.out.print("\nBonus:");
        for (int i = 0; i < bonus.length; i++) {
            System.out.print(bonus[i]+" ");
        }
        System.out.print("\nNew Salary:");
        for (int i = 0; i <  newSalary.length; i++) {
            System.out.print(newSalary[i]+" ");
        }
    }
}