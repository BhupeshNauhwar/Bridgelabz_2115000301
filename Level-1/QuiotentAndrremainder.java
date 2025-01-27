import java.util.Scanner;

class Calculation{
    public int[] findQuiotentAndRemainder(int num1,int num2, int result[]){
        int index=0;
        int quiotent=num1/num2;
        result[index]=quiotent;
        index++;
        int remainder=num1%num2;
        result[index]=remainder;
        index++;
        return result;
    }
}

public class QuiotentAndrremainder {
    public static void main(String[] args) {
        Calculation cal= new Calculation();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int result[]=new int[2];
        int ans[]=cal.findQuiotentAndRemainder(num1,num2,result);
        System.out.println("Quiotent is "+ans[0]);
        System.out.println("Remainder is "+ans[1]);

    }
}
