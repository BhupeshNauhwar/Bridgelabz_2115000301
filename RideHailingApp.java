import java.util.*;

abstract class Vehicle {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }

    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(int vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(int vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(int vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

public class RideHailingApp {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car(101, "John", 15.0, "Downtown"));
        vehicles.add(new Bike(102, "Mike", 7.0, "Uptown"));
        vehicles.add(new Auto(103, "Emma", 10.0, "Midtown"));

        double distance = 10.0;
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
            System.out.println();
        }
    }
}