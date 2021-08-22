package day47_Recap.Phone;

public final class Samsung extends Phone {


    public Samsung(String model, String size, String color, double price) {
        super("Samsung", model, size, color, price);
    }

    @Override
    public void call(long phoneNumber) {
        System.out.println("Samsung Galaxy is calling " + phoneNumber);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println(getBrand() + getModel() + " is calling " + phoneNumber);
    }

    public void text (long phoneNumber1, long phoneNumber2){
        text(phoneNumber1);
        text(phoneNumber2);
    }

    public void text (long phoneNumber1, long phoneNumber2, long phoneNumber3){
        text(phoneNumber1, phoneNumber2);
        text(phoneNumber3);
    }

    public void freeze() {
        System.out.println(getBrand() + " " + getModel() + " is freezing");
    }





}
