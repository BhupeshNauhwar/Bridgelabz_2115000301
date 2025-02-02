import java.util.Scanner;

class CarRental{
    private String customerName;
    private String carModel;
    private int rentalDays;
    private float totalCost;

    public CarRental(String customerName,String carModel,int rentalDays){
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;   
        this.totalCost=calculateTotalCost();
    }
    public float calculateTotalCost(){
        int perDayCost=300000;
        float totalCost=rentalDays*perDayCost;
        return totalCost;   
    }
    public void display(){
        System.out.println("Details of "+customerName);
        System.out.println("Car Model:"+carModel);
        System.out.println("Days:"+rentalDays);
        System.out.println("Total cost:"+totalCost+"\n");
    }

}

public class CarRentalSystem {
    public static void main(String[] args) {
        CarRental rentaldetails1=new CarRental("Bhupesh","BMW",3);
        CarRental rentaldetails2=new CarRental("Bharat","Ferrari",2);
        rentaldetails1.display();
       
        rentaldetails2.display();
        
    }
        
}
