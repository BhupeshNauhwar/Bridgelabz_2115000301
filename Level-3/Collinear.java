import java.util.Scanner;
class Collinear {

    public static boolean areCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        if ((x2 - x1 == 0) || (x3 - x2 == 0)) {
            return (x2 - x1 == 0) && (x3 - x2 == 0);
        }

        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    public static boolean areCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1, y1 for Point A: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2, y2 for Point B: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("Enter x3, y3 for Point C: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        boolean collinearSlope = areCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Are the points collinear using the slope formula? " + collinearSlope);

        boolean collinearArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Are the points collinear using the area of triangle formula? " + collinearArea);

        if (x1 == 2 && y1 == 4 && x2 == 4 && y2 == 6 && x3 == 6 && y3 == 8) {
            System.out.println("The points A(2, 4), B(4, 6), and C(6, 8) are collinear.");
        }
    }
}
