import java.util.Scanner;

class Circle{
    private float radius;
    public Circle(){
        
        this(5.5f);
        

    }
    public Circle(float radius){
        this.radius=radius;
    }
    public void area(){
        System.out.println("Area of circle with radius "+radius+" is "+3.14*radius*radius);
    }
    
}
public class ConstructorChaining {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float radius=sc.nextFloat();
        Circle c1=new Circle();
        c1.area();
        Circle c2=new Circle(radius);
        c2.area();
    }
}
