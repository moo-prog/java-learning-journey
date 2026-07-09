package VehicleSystem;

public class Airplane implements Flyable {
    @Override
    public void takeOff() {
        System.out.println("Airplane took off.");
    }

    @Override
    public void land() {
        System.out.println("Airplane landed.");
    }
}
