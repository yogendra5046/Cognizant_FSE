package vehcile;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = VehicleFactory.getVehicle("car");
        vehicle1.start();

        Vehicle vehicle2 = VehicleFactory.getVehicle("bike");
        vehicle2.start();
    }
}
