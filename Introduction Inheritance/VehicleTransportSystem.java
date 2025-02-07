class Vehicle{
    public float maxSpeed;
    public String fuelType ;

    public Vehicle(float maxSpeed, String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }

    public void display(){
        System.out.print(" with speed "+maxSpeed+" and fuel type is "+fuelType);
    }
}
class Car extends Vehicle{
    private int seatCapacity;
    public Car(float maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity=seatCapacity;
    }
    public void display(){
        System.out.print("Car having seating capacity of "+seatCapacity);
        super.display();
        
    }
} 
class Truck extends Vehicle{
    private int seatCapacity;
    public Truck(float maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity=seatCapacity;
    }
    public void display(){
        System.out.print("Truck having seating capacity of "+seatCapacity);
        super.display();
        
    }
} 
class Motercycle extends Vehicle{
    private int seatCapacity;
    public Motercycle(float maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity=seatCapacity;
    }
    public void display(){
        System.out.print("Motercycle having seating capacity of "+seatCapacity);
        super.display();
        
    }
} 

public class VehicleTransportSystem {

    public static void main(String[] args) {
        Vehicle car=new Car(250, "CNG", 5);

        Vehicle truck= new Truck(150, "diesel", 3);

        Vehicle bike=new Motercycle(160, "Petrol", 2);

       Vehicle vehicles[]= {car,truck,bike};   

       for (Vehicle vehicle : vehicles) {
        vehicle.display();
        System.out.println();       
        System.out.println();       
       }
    }
    
}