import java.util.Scanner;

public class MultiplicationTableRange {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting range");
        int lower=sc.nextInt();
        System.out.println("Enter end range");
        int high=sc.nextInt();
        int result[]=new int[10];

        for(int i=lower;i<=high;i++){
            System.out.println("Table of "+i);
            for (int j = 1; j < 10; j++) {
                result[j-1]=i*j;
                
                
            }
            System.out.println();
            for (int k =1 ; k < 10; k++) {
                System.out.println(i+" X "+(k)+" = "+result[k-1]);
            }
        }
        

    }
}