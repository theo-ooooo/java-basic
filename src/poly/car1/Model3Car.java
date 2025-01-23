package poly.car1;

public class Model3Car implements Car {
    @Override
    public void startEngine() {
        System.out.println("Modal3Car.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("Modal3Car.offEngine");
    }

    @Override
    public void presAccelerator() {
        System.out.println("Modal3Car.presAccelerator");
    }
}
