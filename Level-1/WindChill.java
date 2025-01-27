import java.util.Scanner;

class Calculation{
    public double calculateWindChill(double temp, double windSpeed){
        double windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(windSpeed, 0.16);
        
        return windChill;
    }
}
public class WindChill {
    public static void main(String[] args) {
        Calculation cal=new Calculation();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature");
        double temp=sc.nextDouble();
        System.out.println("Enter wind Speed");
        double windSpeed=sc.nextDouble();
        System.out.println("WindChill: "+cal.calculateWindChill(temp, windSpeed));

    }
}
