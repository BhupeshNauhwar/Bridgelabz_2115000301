import java.util.Scanner;

public class TwoToOneDimension {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int row=sc.nextInt();
        System.out.println("Enter coloumn");
        int col=sc.nextInt();

        int twoDimension[][]=new int[row][col];
        int array[]=new int[row*col];
        for (int i = 0; i < twoDimension.length; i++) {
            for (int j = 0; j < twoDimension[0].length; j++) {
                twoDimension[i][j]=sc.nextInt();
            }
        }
        int count=0;
        for (int i = 0; i < twoDimension.length; i++) {
            for (int j = 0; j < twoDimension[0].length; j++) {
                array[count]=twoDimension[i][j];
                count++;
            }
        }
        System.out.print("One Dimension array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    
}