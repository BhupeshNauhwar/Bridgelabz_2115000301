import java.util.*;
public class AllMultiple {
    public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number");
            int num=sc.nextInt();
            System.out.print("Multiples are ");
            for (int i = num; i >=1; i--) {
                if (num%i==0) {
                    System.out.print(i+" ");
                }
                else{
                    continue;
                }
            }
           
    }
}
