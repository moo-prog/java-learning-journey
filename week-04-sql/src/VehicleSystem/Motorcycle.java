package VehicleSystem;

public class Motorcycle implements Drivable {
    @Override
    public void start() {
        System.out.println("Motorcycle started.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped.");
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle speed up.");
    }
}
