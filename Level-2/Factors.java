import java.util.Scanner;

class Calculation{
    static public int[] findFactors(int num){
        
            int count=0;
        for (int i = 1; i <=num; i++) {
            
            if (num%i==0) {
                count++;

            }
            
        }
        int factors[]=new int[count];
        int index=0;
        for (int i = 1; i <=num; i++) {
           
            if (num%i==0) {
                factors[index]=i;
                index++;

            }
            
        }
    return factors;    
    }
    public int findSum(int factors[]){
        int sum=0;
        for (int i = 0; i < factors.length; i++) {
            sum+=factors[i];
        }
        return sum;
    }
    public int findProduct(int factors[]){
        int product=1;
        for (int i = 0; i < factors.length; i++) {
            product*=factors[i];
        }
        return product;
    }
    public int findsumOfSquare(int factors[]){
        int sum=0;
        for (int i = 0; i < factors.length; i++) {
            sum+=Math.pow(factors[i], 2);
        }
        return sum;
    }
}
public class Factors{
    public static void main(String[] args) {
        Calculation cal=new Calculation();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int ans[]=Calculation.findFactors(num);
        System.out.print("Factors of given number are ");
        for (int a : ans) {
            System.out.print(a+" ");
        }

        System.out.println("\nProduct of factors are "+cal.findProduct(ans));
        System.out.println("Sum of factors are "+cal.findSum(ans));
        System.out.println("Sum of square of factors are "+cal.findsumOfSquare(ans));
    }
}