import java.util.Scanner;
public class TotalTillEnterZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value");
        int value=sc.nextInt();
        Double total=0.0;
        while(value!=0){
            total+=value;
            System.out.print("Enter value again");
            value=sc.nextInt();
        }
            System.out.print("Total value "+ total );
    }
}
