package day45_Inheritance;

public class SquareObjects {

    public static void main(String[] args) {

        Square square1 = new Square(-2);//will not be set because its negative
        System.out.println(square1.getSide());

        square1.setSide(10);
        System.out.println(square1.getSide());

        Square square2 = new Square(square1.getSide());
        System.out.println(square1.equals(square2));




    }


}
