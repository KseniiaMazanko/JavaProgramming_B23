package day43_OOP_Encapsulation;

public class Circle {
    /*
    Create a class named Circle
            Private variables:
                radius, diameter, PI

            generate getter & setter for all private fields
                    Make sure that radius & diameter of circle can never be set to negative

            add a constructor that can set all the fields

            Extra methods:
                equal(): accepts a Circle Object and returns true if the given circle is equal to the current circle
                calcArea(): returns the area
                calcPerimeter(): returns the perimeter
                toString()
     */

    private double radius, diameter;

    private static double PI = 3.14;

    public double getRadius(){

        return radius;
    }

    public double getDiameter(){

        return diameter;
    }

    public void setRadius(double radius){
        if(radius<0){
            System.out.println("Invalid radius");
            return;
        }
        this.radius=radius;
        diameter = radius*2;
        //setDiameter(radius*2);//because once we change the radius diameter also needs to be changed
    }

    public void setDiameter(double diameter){
        if(diameter<0){
            System.out.println("Invalid diameter");
            return;
        }
        this.diameter=diameter;
        radius = diameter/2;
    }

    public Circle(double radius) {
        /*this.radius = radius;
        diameter=radius*2;
         *///instead of using the duplicate code we could use setRadius
        setRadius(radius);
    }

    public double area() {
        return radius*radius*PI;
    }

    public double perimeter() {
        return diameter*PI;
    }

    public boolean equals (Circle circle){
        return radius == circle.radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }
}
