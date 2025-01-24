import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number table");
        int tableOf=sc.nextInt();
        int result[]=new int[10];
        for (int i = 0; i <10; i++) {
            result[i]=tableOf*(i+1);
        }
        System.out.println("multiplication table of "+ tableOf);
        for (int i = 0; i <10 ; i++) {
            System.out.println(tableOf+ " X "+i+" = "+result[i]);
        }
    }
}
