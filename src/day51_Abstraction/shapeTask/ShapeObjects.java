package day51_Abstraction.shapeTask;

import org.w3c.dom.css.Rect;

public class ShapeObjects {

    public static void main(String[] args) {

        //Shape shape = new Shape("Shape")// we cannot create objects from abstract class


        Circle circle = new Circle(-3);
        Square square = new Square(-5);
        Rectangle rect = new Rectangle(-3,-6);

        System.out.println(circle);
        System.out.println(square);
        System.out.println(rect);
    }


}
