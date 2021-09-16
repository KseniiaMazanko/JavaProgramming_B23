package day51_Abstraction.shapeTask;

public final class Circle extends Shape {

        private double r;
        public final static double PI = 3.14;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if(r<0){
            throw new RuntimeException("Radius has to be greater than 0");
        }
        this.r = r;
    }

    public Circle(double r) {
        super("Circle");
        setR(r);
    }

    @Override
    public double area() {
        return r*r*PI;
    }

    @Override
    public double perimeter() {
        return 2*PI*r;
    }
}
