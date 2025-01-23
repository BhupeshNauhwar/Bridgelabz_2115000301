import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1= sc.nextInt();
        System.out.println("Enter second numbers");
        int num2= sc.nextInt();
        System.out.println("Select Operation from +,-,*,/");
        String operation=sc.next();
        switch (operation) {
            case "+":
                System.out.println("Addition of a and b is " + (num1+num2));
                break;
        
            case "-":
                System.out.println("Substraction of a and b is " + (num1-num2));
                break;
        
            case "*":
                System.out.println("Multiplication of a and b is " + (num1*num2));
                break;
        
            case "/":
                System.out.println("Division of a and b is " + (num1/num2));
                break;
        
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}
