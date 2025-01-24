import java.util.Scanner;

public class PositiveNegativeOddEven {
      
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=5;
        int age[]=new int[size];
        System.out.println("Enter five numbers");
        for (int i = 0; i < age.length; i++) {
            age[i]=sc.nextInt();
        }

        for (int i = 0; i < age.length; i++) {
            if (age[i]==0) {
                System.out.println("Zero");
            }else if (age[i]>0) {
                if (age[i]%2==0) {
                    System.out.println(age[i]+" is postive and even");
                }else{
                    System.out.println(age[i]+" is postive and odd");
                }
            }
            else{
                System.out.println("Negative");
            }
        }
 
    }
}
