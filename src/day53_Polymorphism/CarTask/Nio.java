package day53_Polymorphism.CarTask;

public class Nio extends Car implements ElectricCar, AutoPilot{

    public Nio(String model, String color, int year, double price) {
        super("Nio", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Starting Nio " + getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving Nio " + getModel());
    }

    @Override
    public void autoPark() {
        System.out.println("Auto-Parking Nio " + getModel());
    }

    @Override
    public void selfDrive() {
        System.out.println("Self-driving Nio " + getModel());
    }

    @Override
    public void charging() {
        System.out.println("Charging Nio " + getModel());
    }
}
