import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month");
        int month=sc.nextInt();
        System.out.println("Enter day");
        int day=sc.nextInt();
        if (month==3 || day>=20 && day<=31) {
            System.out.println("Spring Seasons");
        } 
        else if (month==4 || day>=1 && day<=30) {
            System.out.println("Spring Seasons");
        } 
        else if (month==5 || day>=1 && day<=31) {
            System.out.println("Spring Seasons");
        } 
        else if (month==6 || day>=1 && day<=20) {
            System.out.println("Spring Seasons");
        } 
        else{
            System.out.println("Not a Spring Season");
        }
    }
}
