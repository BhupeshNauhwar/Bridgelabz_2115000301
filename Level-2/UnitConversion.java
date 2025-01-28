import java.util.Scanner;

class Calculation{
    public static double convertKmToMiles(double km){
        double km2miles = 0.621371*km;
        return km2miles;

    }
    public static double convertMilesToKm(double miles){
        double miles2km = 1.60934*miles;
        return miles2km
;
    }
    public static double convertmetersTofeet(double meters){
        double meters2feet = 3.28084*meters;
        return meters2feet;

    }
    public static double convertFeetsTometers(double feets){
        double feet2meters = 0.3048*feets;
        return feet2meters;

    }
}
public class UnitConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value in km");
        double km=sc.nextDouble();
        System.out.println("Enter value in miles");
        double miles=sc.nextDouble();
        System.out.println("Enter value in feets");
        double feets=sc.nextDouble();
        System.out.println("Enter value in meters");
        double meters=sc.nextDouble();

        System.out.println("Kilometers to miles "+Calculation.convertKmToMiles(km));
        System.out.println("miles to km "+Calculation.convertMilesToKm(miles));
        System.out.println("meters to feet "+Calculation.convertmetersTofeet(meters));
        System.out.println("Feet to meters "+Calculation.convertFeetsTometers(feets));
    }
}
