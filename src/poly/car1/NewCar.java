package poly.car1;

public class NewCar implements Car {
    @Override
    public void startEngine() {
        System.out.println("New Car Engine Started");
    }

    @Override
    public void offEngine() {
        System.out.println("New Car Engine Stopped");
    }

    @Override
    public void presAccelerator() {
        System.out.println("New Car Accelerator Started");
    }
}
