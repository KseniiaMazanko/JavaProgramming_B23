package day47_Recap.Phone;

public class Nokia extends Phone{

    public Nokia(String model, String size, String color, double price) {
        super("Nokia", model, size, color, price);
    }

    public void selfDefense(){
        System.out.println(getBrand() + " " + getModel() + " is designed for self defense");
    }




}
