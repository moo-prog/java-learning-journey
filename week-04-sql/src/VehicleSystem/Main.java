package VehicleSystem;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.accelerate();
        car.start();
        Motorcycle m = new Motorcycle();
        m.start();
        m.accelerate();
        m.stop();
        Airplane a = new Airplane();
        a.land();
        a.takeOff();
    }

}
