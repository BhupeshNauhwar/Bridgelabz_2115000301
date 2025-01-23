import java.util.Scanner;

public class Smallest {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        if (num1>num2) {
            if (num2>num3) {
                System.out.println(num3+" is smallest ");
            } else {
                System.out.println(num2+" is smallest ");
            }
        } else {
            if (num1>num3) {
                System.out.println(num3+" is smallest ");
            } else {
                System.out.println(num1+" is smallest ");
            }
        }
    }
}
