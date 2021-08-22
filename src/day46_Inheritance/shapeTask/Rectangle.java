package day46_Inheritance.shapeTask;

public class Rectangle extends Shape {

    private double length, width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<0){
            return;
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<0){
            return;
        }
        this.width = width;
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
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
