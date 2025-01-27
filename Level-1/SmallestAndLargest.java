import java.util.Scanner;

class Calculation{
    public int[] smallestAndLargest(int num1,int num2,int num3,int result[]){
        int index=0;
        if (num1>num2) {
            if (num1>num3) {
                result[index]=num1;
                index++;
            }else{
                result[index]=num3;
                index++;
            }
        }else{
            if (num2>num3) {
                result[index]=num2;
                index++;
            }else{
                result[index]=num3;
                index++;
            }
        }
        if (num1>num2) {
            if (num2>num3) {
                result[index]=num3;
                index++;
            }else{
                result[index]=num2;
                index++;
            }
        }else{
            if (num1>num3) {
                result[index]=num3;
                index++;
            }else{
                result[index]=num1;
                index++;
            }
        }
        return result;
    }
}
public class SmallestAndLargest {
    public static void main(String[] args) {
        Calculation cal=new Calculation();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int result[]=new int[2];
        int ans[]=cal.smallestAndLargest(num1, num2, num3, result);
        for (int i : ans) {
        
            System.out.print(i+" ");
        }

    }
}
