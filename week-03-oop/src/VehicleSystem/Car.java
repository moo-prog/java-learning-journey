package VehicleSystem;

public class Car implements Drivable{

    @Override
    public void start() {
        System.out.println("The car engine is ON, ready to move.");    }

    @Override
    public void stop() {
        System.out.println("The car has stopped completely.");
    }

    @Override
    public void accelerate() {
        System.out.println("The car is accelerating! Speeding up...");
    }
}
