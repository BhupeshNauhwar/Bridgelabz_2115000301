import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        int size=10;
        int digits[]=new int[size];
        int index=0;
        int largest=0,secondLargest=0;
        while (num!=0) {
            digits[index]=num%10;
            num/=10;
            index++;
            if (index==size) {
                break;
            }
        }
        
        for (int i = 0; i < digits.length-1; i++) {
            if (digits[i]>largest) {
                secondLargest=largest;
                largest=digits[i];
            }else if (digits[i]>secondLargest && digits[i] !=largest) {
                secondLargest=largest;
            }
        }
        System.out.println("Second largest digit is "+secondLargest);
        System.out.println("Largest digit is "+largest);
    }
}
