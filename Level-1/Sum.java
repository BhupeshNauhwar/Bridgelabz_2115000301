import java.util.Scanner;

class Calculation{
    public double sumOfNumbers(int num){
        double sum=0;
        for (int i = 1; i <=num; i++) {
            sum+=i;
        }
    return sum;    
    }
}
public class Sum {
    public static void main(String[] args) {
        Calculation cal=new Calculation();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        double total =cal.sumOfNumbers(num);
        System.out.println("Sum of "+num+" is "+total);
    }
}
