import java.util.Scanner;

class Calculation{
    public boolean checkLeapYear(int year){
        if ((year%4==0 && year%100 != 0)||year%400==0) {
            return true;
        }
    return false;    
    }
}
public class LeapYear {
    public static void main(String[] args) {
     Calculation cal=new Calculation();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter year");
     int year=sc.nextInt();
     if (year<=1582) {
        System.out.println("Not in Gregorian calendar");
        return;
     }   
    if (cal.checkLeapYear(year)) {
        System.out.println(year+" is leap year");
    }     
    else{
        System.out.println(year+" is not leap year");
    }
    }
}
