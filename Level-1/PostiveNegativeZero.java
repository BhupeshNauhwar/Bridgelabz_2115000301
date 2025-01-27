import java.util.Scanner;

class Calcultion{
    public int typeOfNumber(int num){
        if (num>0) {
            return 1;
        } else if(num<0) {
            return -1;
        }else{
            return 0;
        }
    }
}

public class PostiveNegativeZero {
    public static void main(String[] args) {
        Calcultion cal=new Calcultion();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number");
         int num=sc.nextInt();
         int value=cal.typeOfNumber(num);
         System.out.println("Given number "+value);
    }
}
