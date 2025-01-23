import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number");
        int num=sc.nextInt();
        int factorial =1;
        for(int i=num;i>=1;i--){
            factorial*=i;

        }
        System.out.print("The factorial of "+ num+" is "+factorial);
    }
}
