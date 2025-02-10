import java.util.*;

abstract class Vehicle{
	private String vehicleNumber;
	private String type;
	private float rentalRate;

	public Vehicle(String vehicleNumber, String type, float rentalRate){
		this.vehicleNumber=vehicleNumber;
		this.type=type;
		this.rentalRate=rentalRate;
	}

	public String getVehicleNumber(){
		return vehicleNumber;

	}

	public String getType(){
		return type;
	} 

	public float getRentalRate(){
		return rentalRate;
	}

	 
	public abstract float calculateRentalCost(int days);
	
	
}

interface Insurable{
	float calculateInsurance();
	String getInsuranceDetails();
}

class  Bike extends Vehicle implements Insurable{
	private int policyNumber;
	

	public Bike(String vehicleNumber, String type, float rentalRate,int policyNumber){
		super(vehicleNumber, type, rentalRate);
		this.policyNumber=policyNumber;
	}
	public  float  calculateRentalCost(int days){
		return  getRentalRate()*days;
	}
	public float calculateInsurance(){
		return (float)(getRentalRate()*0.1);
	}

	public String getInsuranceDetails(){
		return "Bike insurance Number:"+policyNumber;
	}
}


class  Car extends Vehicle implements Insurable{
	private int policyNumber;
	

	public Car(String vehicleNumber, String type, float rentalRate,int policyNumber){
		super(vehicleNumber, type, rentalRate);
		this.policyNumber=policyNumber;
	}
	public  float  calculateRentalCost(int days){
		return  getRentalRate()*days;
	}
	public float calculateInsurance(){
		return (float)(getRentalRate()*0.2);
	}

	public String getInsuranceDetails(){
		return "Car insurance Number:"+policyNumber;
	}
}


class  Truck extends Vehicle implements Insurable{
	private int policyNumber;
	

	public Truck(String vehicleNumber, String type, float rentalRate,int policyNumber){
		super(vehicleNumber, type, rentalRate);
		this.policyNumber=policyNumber;
	}
	public  float  calculateRentalCost(int days){
		return  getRentalRate()*days;
	}
	public float calculateInsurance(){
		return (float)(getRentalRate()*0.1);
	}

	public String getInsuranceDetails(){
		return "Truck insurance Number:"+policyNumber;
	}
}


public class VehicleRentalSystem{
	public static void main(String args[]){
		List<Vehicle> vehicles=new ArrayList<>();

		Car car=new Car("Z234", "4 Seater", 1200, 456);

        Truck truck=new Truck("A34","3", 3500, 765);
		
        Bike bike=new Bike("Cs8994", "2 Sester", 600, 654);


        int days=5;
        vehicles.add(bike);
        vehicles.add(car);
        vehicles.add(truck);
		
        for(Vehicle v:vehicles){
			System.out.println("Vehicle Numnber:"+v.getVehicleNumber());
			System.out.println("Vehicle Type:"+v.getType());
			System.out.println("Rental cost for "+days+" days "+v.calculateRentalCost(days));
            
            if(v instanceof Insurable){
				System.out.println("Insurance Cost:"+((Insurable)v).calculateInsurance());
                System.out.println(((Insurable)v).getInsuranceDetails()+"\n");
			}
		}	 

	}
}

