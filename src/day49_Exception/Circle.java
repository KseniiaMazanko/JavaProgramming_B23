package day49_Exception;

public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        if(radius<0){
            //return;
            throw new RuntimeException("Radius of the circle cannot be negative");
        }
        this.radius=radius;
    }

    public Circle(double radius){
        setRadius(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
