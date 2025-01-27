import java.util.Scanner;

class Calculation{
    public int[] findQuiotentAndRemainder(int num1,int divisor){
        int result[]=new int[2];
        int index=0;
        int quiotent=num1/divisor;
        result[index]=quiotent;
        index++;
        int remainder=num1%divisor;
        result[index]=remainder;
        index++;
        return result;
    }
}
public class Chocalates {
    public static void main(String[] args) {
        Calculation cal=new Calculation();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Chocolates");
        int Chocalates=sc.nextInt();
        System.out.println("Enter number of students");
        int students=sc.nextInt();
        int ans[]=cal.findQuiotentAndRemainder(Chocalates, students);
        System.out.println("Each childe get "+ans[0]+ " Chocalates and remaining chocolates are "+ans[1]);
    }
}
