import java.util.Scanner;

public class DoubleOpt {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        System.out.println("a + b *c:"+(a + b *c));
        System.out.println("a * b + c:"+(a * b + c));
        System.out.println(" c + a / b:"+( c + a / b));
        System.out.println("a % b + c:"+(a % b + c));
    }
}
