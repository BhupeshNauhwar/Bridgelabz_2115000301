import java.util.Scanner;

public class CompareSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number");
        int num=sc.nextInt();
        int sumFormula=0,sum=0;
        sumFormula=num*(num+1)/2;

        for(int i=1; i<=num;i++){
            sum+=i;
        }

        if(sumFormula== sum){
        System.out.print("Result is equal of both sum and value is " +sum);
        }
    }
}
