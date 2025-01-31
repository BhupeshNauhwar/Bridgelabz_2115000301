class Circle{
    private double radius;
    
    public Circle(double radius){
        this.radius=radius;
    }

    public double areaOfCircle(){
        double pi=3.14;
        double area=pi*radius*radius;
        return area;
    }
    public double circumfernceOfCircle(){
        double pi=3.14;
        double circumfernce=2*pi*radius;
        return circumfernce;
    }
    public double getRadius(){
        return radius;
    }
    public void displayDetails(){
        System.out.println("Area of circle:"+areaOfCircle());
        System.out.println("Circumfernce of circle:"+circumfernceOfCircle());
    }
    
}

public class AreaOfCircleMain {
    public static void main(String []args){
        Circle c1=new Circle(3.2);
        Circle c2=new Circle(43.1);
        Circle c3=new Circle(22.232);

        System.out.println("Area of circle with radius "+c1.getRadius());
         c1.displayDetails();
        System.out.println();
        System.out.println("Area of circle with radius "+c2.getRadius());
        c2.displayDetails();
        System.out.println();
        System.out.println("Area of circle with radius "+c3.getRadius());
        c3.displayDetails();
    }     
}
