package day43_OOP_Encapsulation;

public class CircleObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(-2);

        System.out.println(circle1);

        circle1.setRadius(3);

        System.out.println(circle1);

        System.out.println(circle1.area());
        System.out.println(circle1.perimeter());


        Circle circle2 = new Circle(5);

        System.out.println(circle2.equals(circle1));








    }


}
