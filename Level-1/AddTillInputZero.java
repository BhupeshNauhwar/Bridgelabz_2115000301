import java.util.Scanner;

public class AddTillInputZero {
    public static void main(String[] args) {
        int input[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value ");
        int value=sc.nextInt();   
        int index=0;
        double total=0.0;
        while (true) {
            if (index==10) {
                break;
            }
            
            if (value<=0) {
                break;
            }
            input[index]=value;
            index++;
            System.out.println("enter value again");
            value=sc.nextInt();
            
            
            
        }
        for (int i = 0; i < input.length; i++) {
            total+=input[i];
        }
        System.out.println("Total "+total);
    }
}
