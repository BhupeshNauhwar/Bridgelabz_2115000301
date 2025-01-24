import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=11;
        double height[]=new double[size];
        double sum=0.0;
        System.out.println("enter height");
        for (int i = 0; i < height.length; i++) {
            height[i]=sc.nextDouble();
        }
        for (int i = 0; i < height.length; i++) {
            sum+=height[i];
        }
        double avg=sum/11;

        System.out.println("Average of height of basketball 11 players is "+avg);
    }
}
