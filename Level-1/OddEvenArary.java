import java.util.Scanner;

public class OddEvenArary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enters number");
        int num=sc.nextInt();
        if (num<0) {
            return;
        }
        int size=num+1/2;
        int even[]=new int[size];
        int odd[]=new int[size];
        int counteven=0;
        int countOdd=0;
        for (int i = 1; i <=num; i++) {
            if (i%2==0) {
                even[counteven]=i;
                counteven++;
            } else {
                odd[countOdd]=i;
                countOdd++;
            }
        }
        System.out.print("Odd array:");
        for (int i = 0; i < countOdd; i++) {
            System.out.print(odd[i]+"  ");
        }
        System.out.print("\nEven array:");
        for (int i = 0; i < counteven; i++) {
            System.out.print(even[i]+"  ");
        }
    }
}
