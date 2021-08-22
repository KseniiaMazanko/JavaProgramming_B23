package day47_Recap.Phone;

public class PhoneObjects {

    public static void main(String[] args) {

        IPhone iphone = new IPhone("12", "large", "Black", 1000);
        iphone.call(311);
        iphone.call(12345, 12345678);
        iphone.faceTime(917622234);
        System.out.println(iphone);

        System.out.println("_________________________________");

        Samsung samsung = new Samsung("Galaxy S6", "Extra large", "White", 900);
        samsung.freeze();
        samsung.call(4567890);
        samsung.text(3454567, 45566);
        System.out.println(samsung);

        System.out.println("_________________________________");

        Nokia nokia = new Nokia("Brick", "Small", "Gray", 50);
        nokia.selfDefense();
        System.out.println(nokia);

        nokia.setPrice(100);
        System.out.println("New price for Nokia is " + nokia.getPrice());


    }



}
