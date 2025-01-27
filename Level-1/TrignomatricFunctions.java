import java.util.Scanner;

class Calculation{
    public double[] calculateTrigonometricFunctions(double angle){
        double radianAngle=Math.toRadians(angle);
        double sin=Math.sin(radianAngle);
        double cosine=Math.cos(radianAngle);
        double tangent=Math.tan(radianAngle);
        return new double[]{sin,cosine,tangent};
    }

}
public class TrignomatricFunctions {
    public static void main(String[] args) {
        Calculation cal=new Calculation();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter angle in degree");
        double angle=sc.nextDouble();
        double ans[]=cal.calculateTrigonometricFunctions(angle);
        System.out.println("sin ="+ans[0]);
        System.out.println("cos ="+ans[1]);
        System.out.println("tangent ="+ans[2]);
    }
}
