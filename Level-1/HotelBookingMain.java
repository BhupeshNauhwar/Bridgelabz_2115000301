class HotelBooking{
    private String guestName;
    private int nights;
    private  String roomType;

    public HotelBooking(){
        this.guestName="Unknown";
        this.nights=1;
        this.roomType="Single";

    }
    public HotelBooking(String guestName, int nights, String roomType){
        this.guestName=guestName;
        this.nights=nights;
        this.roomType=roomType;
    }
    public HotelBooking(HotelBooking hb){
        guestName=hb.guestName;
        nights=hb.nights;
        roomType=hb.roomType;
    }
    public void details(){
        System.out.println("Name:"+guestName);
        System.out.println("Nights:"+nights);
        System.out.println("Room Type:"+roomType+"\n");
    }
}

public class HotelBookingMain {
    public static void main(String[] args) {
        HotelBooking booking1=new HotelBooking();
        HotelBooking booking2=new HotelBooking("Bhupesh",4,"Delux");
        HotelBooking booking4=new HotelBooking("XYZ",2,"Single");
        HotelBooking booking3=new HotelBooking(booking2);

        System.out.println("Details using Default Constructor");
        booking1.details();
        System.out.println("Details using parameterised Constructor");
        booking2.details();
        System.out.println("Details using copy Constructor");
        booking3.details();
        System.out.println("Details using parameterised Constructor");
        booking4.details();




    }
}
