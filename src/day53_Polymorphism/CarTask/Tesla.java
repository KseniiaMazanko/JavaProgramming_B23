package day53_Polymorphism.CarTask;

public class Tesla extends Car implements AutoPilot, ElectricCar{


    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println("Tesla " + getModel() + " has a feature of auto parking");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla " + getModel() + " has a feature of self-driving");
    }

    @Override
    public void start() {
        System.out.println("Starting Tesla " + getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving Tesla " + getModel());
    }

    @Override
    public void charging() {
        System.out.println("Charging Tesla " + getModel());
    }
}
