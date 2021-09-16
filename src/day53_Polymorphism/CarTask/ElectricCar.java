package day53_Polymorphism.CarTask;

public interface ElectricCar {

    /*
    Create an interface named ElectricCar
			abstract method: charging();
     */

    //   public final static int a = 100;
    boolean hasBattery = true; // public static final by default

    public static void main(String[] args) {
        System.out.println(hasBattery);
    }


    void charging();


    /*
    what we cannnot have:
    static{ block
    }
    {
    }
    void method1(){
    }
    public ElectricCar(){
    }
    instance variable
     */

}
