import java.util.Scanner;

public class FizzBuzzWhileLoop {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numbers");
        int num=sc.nextInt();
        int temp=0;
        while (temp<=num) {        
            if (temp%3==0 &&temp%5==0) {
                System.out.println("FizzBuzz");
            }else if (temp%5==0) {
                System.out.println("Buzz");
            } else if (temp%3==0 ) {
                System.out.println("Fizz");
            }else{
                System.out.println(temp);
            }
            temp++;
        }
    }
    
}