import java.util.Scanner;

class Calcultion{
    public boolean typeOfSeason(int day, int months){
        if ( day>=20 && months>=3) {
            return true;
        }else if(day<=31 && months==4){
            return true;
        }
        else if(day<=31 && months==5){
            return true;
        }
        else if(day<=20 && months==6){
            return true;
        }
    return false;    
    }
}
public class SpringSeason {
    public static void main(String[] args) {
        Calcultion cal=new Calcultion();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day");
        int day=sc.nextInt();
        System.out.println("Enter months in number");
        int months=sc.nextInt();
        boolean season=cal.typeOfSeason(day, months);
        if (season==true) {
            System.out.println("Spring Season");
        }else{
            System.out.println("Not spring Season");
        }
    }
}
