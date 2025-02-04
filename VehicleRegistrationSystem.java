class Vehicle{
    private static float registrationFee=2500;

    private final int registratioNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(int registrationNumber ,String ownerName, String vehicleType){
        this.ownerName=ownerName;
        this.registratioNumber=registrationNumber;
        this.vehicleType=vehicleType;
    }
    public static void updateRegistrationfees(int newRegistrationfee){
        registrationFee=newRegistrationfee;
    }
    public void display(){

        System.out.println("Registratio Number:"+registratioNumber);
        System.out.println("owner Name:"+ownerName);
        System.out.println("Registration fee:"+registrationFee);
        System.out.println("Vehicle type:"+vehicleType+"\n");
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle(7654, "Jhon", "Bike");
        Vehicle v2=new Vehicle(7354, "Xyz", "Car");
        
        if (v1 instanceof Vehicle) {
            v1.display();;
        }

        Vehicle.updateRegistrationfees(4560);

        if (v2 instanceof Vehicle) {
            v2.display();
        }
    }
}
