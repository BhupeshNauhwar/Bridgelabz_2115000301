import java.util.Scanner;

public class Divisible{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers");
        int num=sc.nextInt();

        if (num%5==0) {
            System.out.println(num+" is divisible by 5");
        } else {
            System.out.println(num+" is not divisible by 5");
        }
    }
}