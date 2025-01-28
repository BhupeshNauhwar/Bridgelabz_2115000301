import java.util.Scanner;

class Calculation{
    public int sumFormula(int num){
        int sum=0;
        sum=num*(num+1)/2; 
        return sum;
    }
    public int recursiveSum(int num){
        
        if (num==0) {
            return 0;
            
        }
        return num+recursiveSum(num-1);    
    }
    public boolean CompareBothSum(int sum1,int sum2){
        if (sum1==sum2) {
            return true;
        } 
        return false;
    }
}
public class CompareSum {
    public static void main(String[] args) {
        Calculation cal=new Calculation();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int formulaSum=cal.sumFormula(num);
        int recursionSum=cal.sumFormula(num);

        if (cal.CompareBothSum(formulaSum, recursionSum)) {
            System.out.println("Both sum are equals and sum is "+recursionSum);
        }
        else{
            System.out.println("Both sum are noth equals");
        }

    }
}
