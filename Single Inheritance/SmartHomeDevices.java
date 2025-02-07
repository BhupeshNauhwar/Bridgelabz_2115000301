class Device{
    public String status;
    public int deviceId;

    public Device(String status, int deviceId){
        this.deviceId=deviceId;
        this.status=status;
    }

    public void displayStatus(){
        System.out.println("Device Id"+deviceId+" status "+status);
    }

}
class Thermostat extends Device{
    private double temperatureSetting;
    

    public Thermostat(String status, int deviceId, double temperatureSetting){
        super(status, deviceId);
        this.temperatureSetting=temperatureSetting;
        
    }
    public void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting);
    }
}

public class SmartHomeDevices {
    public static void main(String[] args) {
        Device d1=new Device("online", 345);
        d1.displayStatus();

        Thermostat t=new Thermostat("acd", 432, 32);

        t.displayStatus();
    }
}