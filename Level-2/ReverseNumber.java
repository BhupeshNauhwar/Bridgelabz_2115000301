import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();

        int count=0;
        int temp=num;
        while (temp>0) {
            temp/=10;
            count++;
        }
        int array[]=new int[count];
        int index=0;
        while (num>0) {
            array[index]=num%10;
            num/=10;
            index++;
        }
        int reverse[]=new int[count];
        for (int i = array.length-1; i >= 0; i--) {
            reverse[i]=array[i];
        }
        System.out.print("Number after reversing is ");
        for (int i : reverse) {
            System.out.print(i);
        }
    }
}
