package day37_CustomClass;

public class CatPark {


    public static void main(String[] args) {

        Cat cat1 = new Cat();

        cat1.setInfo("Pearl", "White", 1, "Unknown",
                "Large");

        cat1.getInfo();

        cat1.drink("milk");
        cat1.eat("cats food");
        cat1.scratch(true);
        cat1.breakThings("vase");

    }
}
