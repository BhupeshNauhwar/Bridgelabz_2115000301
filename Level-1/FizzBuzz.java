import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        String array[]=new String[num];

        for (int i = 1; i <= num; i++) {
            if (i%3==0 && i%5==0) {
                array[i-1]="FizzBuzz";
            }else if (i%3==0) {
                array[i-1]="Fizz";
            }
            else if (i%5==0) {
                array[i-1]="Buzz";
            }else{
                array[i-1]=Integer.toString(i);
            }
        }

        for (String s : array) {
            System.out.println(s);
        }
    }
}
