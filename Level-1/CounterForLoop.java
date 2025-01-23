import java.util.Scanner;

public class CounterForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of counter");
        int counter=sc.nextInt();
        for(int i=counter;i>=1;i--) {
            System.out.println(counter);
            counter--;
        }
    }
}
