import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting number");
        int lower=sc.nextInt();
        System.out.print("");
        int high=sc.nextInt();
        for(int i=lower;i<=high;i++){
            
            for(int j=1;j<=10;j++){
                
                System.out.println(i+ " X"+ j +" = "+(lower*j));

            }
            
            System.out.println();
        }
    }
}
