package day47_Recap.Phone;

public final class IPhone extends Phone{

    private static String countryMadeIn = "USA";

    public IPhone(String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }

    public void call(long phoneNumber){
        System.out.println("Apple' iphone is calling " + phoneNumber);
    }

    public void call(long phone1, long phone2){//overloading
        call(phone1);
        call(phone2);
    }

    public void call(long phone1, long phone2, long phone3){//overloading
        call(phone1, phone2);
        call(phone3);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println("Apple's Iphone is texting " + phoneNumber);
    }

    public final void faceTime (long phoneNumber){
        System.out.println("Apple's Iphone is face timing with " + phoneNumber);
    }

    public final void faceTime (long phoneNumber1, long phoneNumber2){ //overloading
        faceTime(phoneNumber1);
        faceTime(phoneNumber2);
    }

}
