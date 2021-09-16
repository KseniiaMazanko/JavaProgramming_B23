package day49_Exception;

public class CircleObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(-1);
        System.out.println(circle1);


        Circle circle2 = new Circle(3);
        System.out.println(circle2);

        throw new BreakTimeException("Custom exception");




    }

}
