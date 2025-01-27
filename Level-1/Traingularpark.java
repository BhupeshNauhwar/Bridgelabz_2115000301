import java.util.Scanner;

class Calcultion{
    public double perimeter(double side1, double side2, double side3){
        double perimeterTriangle= side1+side2+side3;
        return perimeterTriangle;
    }
    public double numberRounds(double perimeterTriangle,int totalDistance){
        double completeRounds=totalDistance/perimeterTriangle;
        return completeRounds;
    }
        
    

}
public class Traingularpark {
    public static void main(String[] args) {
        Calcultion cal=new Calcultion();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sides of triangle in meters");
        double side1=sc.nextDouble();
        double side2=sc.nextDouble();
        double side3=sc.nextDouble();
        int totalDistance=5000;
        double perimeterTriangle =cal.perimeter(side1,side2,side3);
        double numberOfRounds=cal.numberRounds(perimeterTriangle,totalDistance);

        int completeRounds=(int)numberOfRounds;
        double partialRounds=numberOfRounds-completeRounds;
        System.out.println("The complete rounds of athelete is "+completeRounds);
        if (partialRounds>0) {
            System.out.print("and partial round of athelete is 1");
        }

    }   
}
