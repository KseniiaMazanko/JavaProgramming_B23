package day53_Polymorphism.CarTask;


class A{

    static int a;

    static{
        a=100;
    }

    int b;

    {
        b = 200;
    }


}

public interface AutoPark {

    /*
    create an interface named AutoPark
			abstract method: autoPark();
     */


    boolean isSmart = true; //public static final by default
    boolean hasSensor = true;

    public abstract void autoPark();



}
