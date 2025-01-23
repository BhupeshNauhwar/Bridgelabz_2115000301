import java.util.*;
public class Factor {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers");
        int num=sc.nextInt();
        System.out.print("Factors are ");
        for (int i = 1; i <=num; i++) {
            if (num%i==0) {
                System.out.print(i+" ");
            }
        }
    }
}