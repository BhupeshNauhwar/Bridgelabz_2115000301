import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numbers");
        int num=sc.nextInt();
        int maxFactors=10;
        int index=0;
        int factors[]=new int[maxFactors];
        for (int i = 1; i <=num; i++) {
            if (num%i==0) {
                if (index==maxFactors) {
                    maxFactors*=2;
                    int temp[]=new int[maxFactors];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j]=factors[j];
                    }
                    factors=temp;
                }
                factors[index]=i;
                index++;

            }
        }
        System.out.print("Factors of "+ num+" are ");
        for (int j = 0; j <index; j++) {
            System.out.print(factors[j]+ "  ");
        }
    }
}
