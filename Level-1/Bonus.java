import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Experience");
        int year=sc.nextInt();
        System.out.println("Enter Salary");
        float salary=sc.nextFloat();

        if (year>5) {
            float bonus=salary*5/100;
            float newSalary=salary+bonus;
            System.out.println("New Salary is "+newSalary+"after adding bonus "+bonus);
        } 
    }    
}
