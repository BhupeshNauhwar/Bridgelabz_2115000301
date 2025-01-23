import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int flag=0;
        if (num==0 || num==1) {
            System.out.println(num+" is not prime ");
            return;
        }
        else {
            for(int i=2;i<num/2;i++){
                if(num%i==0){
                    System.out.println(num+" is not prime ");
                    flag++;
                    break;
                }
            }
        }
        
        if (flag==0) {
            System.out.println(num+" is prime ");
        }
        


    }
}
