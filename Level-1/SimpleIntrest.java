import java.util.Scanner;

class Calcultion {
    public double intreset(double principal, double intreset, int time){
            double Si=principal*intreset*time/100;

        return Si; 
    }
    
}

public class SimpleIntrest{
    public static void main(String[] args) {
        Calcultion cal=new Calcultion();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal");
        double principal=sc.nextDouble();
        System.out.println("Enter intrest");
        double intreset=sc.nextDouble();
        System.out.println("Enter time");
        int time=sc.nextInt();
        
        double value =cal.intreset(principal, intreset,time);
        System.out.println("The Simple Interest is "+ value+" for Principal " +principal+", Rate of Interest "+intreset+" and Time "+time);
    }
}