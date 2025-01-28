import java.util.Scanner;

class Calculation{
    public static double convertFarhenheitToCelsius(double farhenheit){
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;

    }
    public static double convertCelsiusToFahrenheit (double celsius){
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;

    }
    public static double convertPoundsTokilograms(double pounds){
        double pounds2kilograms = 0.453592*pounds;
        return pounds2kilograms;

    }
    public static double convertKilogramstoPounds(double kg){
        double kilograms2pounds = 2.20462*kg;
        return kilograms2pounds;

    }
    public static double convertGallonstoLiters(double gallons){
        double gallons2liters = 3.78541*gallons;
        return gallons2liters;

    }
    public static double convertLiterstoGallons(double liters){
        double liters2gallons = 0.264172*liters;
        return liters2gallons;

    }
}
public class UnitConversion2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value in farheneit");
        double farheneit=sc.nextDouble();
        System.out.println("Enter value in celsius");
        double celsius=sc.nextDouble();
        System.out.println("Enter value in pounds");
        double pounds=sc.nextDouble();
        System.out.println("Enter value in kg");
        double kg=sc.nextDouble();
        System.out.println("Enter value in gallons");
        double gallons=sc.nextDouble();
        System.out.println("Enter value in liters");
        double liters=sc.nextDouble();

        System.out.println("Fahrenheit to Celsius"+Calculation.convertFarhenheitToCelsius(farheneit));
        System.out.println("Celsius to Fahrenheit and"+Calculation.convertCelsiusToFahrenheit(celsius));
        System.out.println("pounds to kilograms"+Calculation.convertPoundsTokilograms(pounds));
        System.out.println("kilograms to pounds"+Calculation.convertKilogramstoPounds(kg));
        System.out.println("gallons to liters "+Calculation.convertGallonstoLiters(gallons));
        System.out.println("liters to gallons "+Calculation.convertLiterstoGallons(liters));
    }
}
