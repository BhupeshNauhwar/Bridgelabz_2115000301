import java.util.Arrays;
import java.util.Scanner;

class Calculation{
    public static double[] findRoots(double a, double b, double c){
        double delta=Math.pow(b, 2)-4*a*c;
        if (delta<0) {
            return new double[0];
        }else if (delta>0) {
            double sqrtDelta=Math.sqrt(delta);
            double root1=(-b+sqrtDelta)/2*a;
            double root2=(-b-sqrtDelta)/2*a;
            return new double[]{root1,root2};
        }else{
            double root = -b / (2 * a);
            return new double[]{root};
        }
    }
}
public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculation cal=new Calculation();
        System.out.println("Enter coefficient a:");
        double a = sc.nextDouble();

        System.out.println("Enter coefficient b:");
        double b = sc.nextDouble();

        System.out.println("Enter coefficient c:");
        double c = sc.nextDouble();
        double roots[]=cal.findRoots(a,b,c);
        if (roots.length == 0) {
            System.out.println("No real roots (Delta is negative).");
        } else {
            System.out.println("Roots are");
            for (int i = 0; i < roots.length; i++) {
                System.out.println(roots[i]);
            }
        }
    }
    
}