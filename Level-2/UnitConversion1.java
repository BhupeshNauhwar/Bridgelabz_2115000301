import java.util.Scanner;

class Calculation{
    public static double convertYardsToFeet(double yards){
        double yards2feet = 3*yards;
        return yards2feet;

    }
    public static double convertfeeTtoYards (double feet){
        double feet2yards = 0.333333*feet;
        return feet2yards;

    }
    public static double convertmetersToinches(double meters){
        double meters2inches = 39.3701*meters;
        return meters2inches;

    }
    public static double inchesToMeters(double inches){
        double inches2meters = 0.0254*inches;
        return inches2meters;

    }
    public static double inchesToCentimeters(double inches){
        double inches2cm = 2.54*inches;
        return inches2cm;

    }
}
public class UnitConversion1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value in yard");
        double yards=sc.nextDouble();
        System.out.println("Enter value in inches");
        double inches=sc.nextDouble();
        System.out.println("Enter value in feets");
        double feets=sc.nextDouble();
        System.out.println("Enter value in meters");
        double meters=sc.nextDouble();

        System.out.println("yards to feet"+Calculation.convertYardsToFeet(yards));
        System.out.println("feet to yards "+Calculation.convertfeeTtoYards(feets));
        System.out.println("meters to inches"+Calculation.convertmetersToinches(meters));
        System.out.println("inches to meters "+Calculation.inchesToMeters(inches));
        System.out.println("inches to cm "+Calculation.inchesToCentimeters(inches));
    }
}
