package day46_Inheritance.shapeTask;

public class Circle extends Shape {

    private double radius, diameter;
    private static double PI = 3.14;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
        setDiameter(radius*2);//setDiameter(radius*2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<0){
            return;
        }
        this.radius = radius;
        diameter=2*radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        if(diameter<0){
            return;
        }
        this.diameter = diameter;
        radius=diameter/2;
    }

    @Override
    public double area() {
        return PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return PI*2*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                super.toString()+
                '}';
    }

    /*
3. override super class' calculateArea(), calculatePerimeter() methods to the sub classes:

		 		Area of the circle:    3.14 * radius * radius
		 		Area of the rectangle:  width * length
		 		Area of the square:    side * side

		 		Perimeter of circle:   3.14 * 2 * radius
		 		Perimeter of rectangle: (width + length) * 2
		 		Perimeter of Square: 4 * side
 */



}
