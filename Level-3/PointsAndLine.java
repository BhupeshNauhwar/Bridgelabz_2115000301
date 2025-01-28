import java.util.Scanner;
class PointsAndLine {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static String calculateLineEquation(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            return "The line is vertical with equation: x = " + x1;
        }

        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - slope * x1;

        return String.format("y = %.2f*x + %.2f", slope, yIntercept);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance between the two points: %.2f\n", distance);

        String lineEquation = calculateLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: " + lineEquation);
    }
}
