import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        System.out.println("Enter third number");
        int num3=sc.nextInt();
        if (num1>num2) {
            if (num1>num3) {
                System.out.println(" Is the first number the larges? Yes " );
                System.out.println("Is the second number the largest? No");
                System.out.println("Is the third number the largest? No");
                
            }else  {
                System.out.println(" Is the first number the larges? No ");
                System.out.println("Is the second number the largest? No ");
                System.out.println("Is the third number the largest? Yes");
            }
        } else {
            if (num2>num3) {
                System.out.println(" Is the first number the larges? No " );
                System.out.println("Is the second number the largest? Yes");
                System.out.println("Is the third number the largest? No");
                
            }else  {
                System.out.println(" Is the first number the larges? No ");
                System.out.println("Is the second number the largest? No");
                System.out.println("Is the third number the largest? Yes");
            }
        }
    }
}
