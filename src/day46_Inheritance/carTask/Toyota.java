package day46_Inheritance.carTask;

public class Toyota extends Car {

    public static boolean isReliable = true;

    public Toyota(String model, int year, double price, String color, long miles) {
        super("Toyota", model, year, price, color, miles);//cause brand of Toyota cars is always Toyota
    }




}
