package day47_Recap.Phone;

public class Phone {

    /*
    create the following custom final classes:

    1. iPhone:
            variables: brand, model, size, price, color

            methods: call(), text(), faceTime(), toString()

    2. Samsung:
            variables: brand, model, size, price, color

            methods: call(), text(), freeze(), toString()

    3. Nokia:
            variables: brand, model, size, price, color

            methods: call(), text(), selfDefense(), toString()
     */

    private final String brand;
    private final String model;
    private final String size;
    private String color;
    private double price;

    public final static boolean isTouchScreen;
    public final static boolean hasSimCard;

    static {
        isTouchScreen=true;
        hasSimCard=true;
    }

    public Phone(String brand, String model, String size, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        setColor(color);
        setPrice(price);
    }

    public double getPrice(){
        return price;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price){
        if(price<0){
            return;
        }
        this.price=price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void call (long phoneNumber){
        System.out.println("Phone is calling" + phoneNumber);
    }

    public void text (long phoneNumber){
        System.out.println("Phone is texting to " + phoneNumber);
    }
}
