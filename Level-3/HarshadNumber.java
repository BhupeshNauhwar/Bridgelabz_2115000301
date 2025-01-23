import java.util.*;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        while (temp>0) {
            int  rem=temp%10;
            temp/=10;
            sum+=rem;
        }
        if (num%sum==0) {
            System.out.println(num+" is Harshad number");
        } else {
            System.out.println(num+" is not a Harshad number");
        }
    }
}
