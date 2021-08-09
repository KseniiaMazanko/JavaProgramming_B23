package day39_CustomClass_Static;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Circle {

    /*
    CircleTask
        1. create a class named Student that has the followings features
            Attributes:
                    radius, diameter

                methods:
                    calculate(): returns the area of the circle
                    calculatePerimeter(): returns the perimeter of the circle
                    setInfo(): initializes all the instance of the Circle
                    toString(): displays the radius, diameter, perimeter and area of the circle object
     */

    public double radius, diameter;
    public static double PI = 3.14;//only one copy of static variables will be created that will be shared by all objects

    public void setInfo(double radius){
        this.radius=radius;
        diameter=2*radius;
    }

    public double calculateArea(){
        return PI*radius*radius;
        //or radius*radius*Math.PI; then no need to declare line 19
    }

    public double calculatePerimeter(){
        return diameter*PI;
    }



    public String toString() {

        DecimalFormat df = new DecimalFormat("0.00");

        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area = " + df.format(calculateArea()) +
                ", perimeter = " + df.format(calculatePerimeter()) +
                '}';
    }
}
