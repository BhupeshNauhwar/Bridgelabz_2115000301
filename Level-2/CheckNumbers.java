import java.util.Scanner;

class Calcultaion{
    public boolean checkPostiveNegative(int nums){
        if (nums<0) {
            return false;
        }else if (nums==0) {
            return false;
        }
    return true;    
    }
    public boolean checkEvenOdd(int nums){
        if (nums%2!=0) {
            return false;
        }
    return true;    
    }
    public String checkGreaterLesser(int num1,int num2){
        if (num1>num2) {
            return "Greater";
        }else if (num1==num2) {
            return "Equals";
        }else{
            return "Lesser";
        }
     
    }
}
public class CheckNumbers {
    public static void main(String[] args) {
        Calcultaion cal=new Calcultaion();
        Scanner sc=new Scanner(System.in);
        int size=5;
        int nums[]=new int[size];
        System.out.println("Enter numbers");
        for (int i = 0; i < nums.length; i++) {
             nums[i]=sc.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
           if (cal.checkPostiveNegative(nums[i])) {
           
            if (cal.checkEvenOdd(nums[i])) {
                System.out.println(nums[i]+" is positive and even");
            }
            else{
                System.out.println(nums[i]+" is positive and odd");
            }
           }
           else{
            System.out.println(nums[i]+" is negative");
           } 
        }
        int firstelement=nums[0];
        int lastelement=nums[size-1];
        System.out.println("The first is "+cal.checkGreaterLesser( firstelement,lastelement)+" last element" );
        

    }
}
