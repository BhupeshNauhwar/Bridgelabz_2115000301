import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        int digit=Integer.toString(num).length();
        while (temp>0) {
            int rem=temp%10;
            sum=(int)(sum+Math.pow(rem, digit));
            temp/=10;
        }
        if (num==sum) {
            System.out.println(num+" is armstrong number");
        }else{
            System.out.println(num+" is not armstrong number");
        }
    }
}