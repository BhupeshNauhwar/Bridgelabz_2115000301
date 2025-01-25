import java.util.Scanner;

public class AmarAkbarAnthony {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double height[]=new double[3];
        int age[]=new int[3];
        String name[]={"Amar","Akbar","Anthony"};
        int temp=0,temp2=0;
        for (int i = 0; i < age.length; i++) {
            System.out.println("Enter age of "+name[i]);
            age[i]=sc.nextInt();
        }
        for (int i = 0; i < height.length; i++) {
            System.out.println("Enter height of "+name[i]);
            height[i]=sc.nextDouble();
        }
        for (int i = 1; i < age.length; i++) {
            if (age[i]<age[temp]) {
                temp=i;
            }
        }
        System.out.println("Youngest among 3 friends is " +name[temp]);
        for (int i = 1; i < height.length; i++) {
            if (height[i]>height[temp2]) {
                temp2=i;
            }
        }
        System.out.println("Tallest among 3 friends is " +name[temp2]);

    }
}
