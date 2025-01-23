import java.util.Scanner;

public class TotalTillEnterZeroNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value");
        int value=sc.nextInt();
        Double total=0.0;
        while(true){
            if(value<=0) { break;}
            total+=value;
            System.out.print("Enter value again");
            value=sc.nextInt();
            }
            System.out.print("Total value "+ total );
    }
}
