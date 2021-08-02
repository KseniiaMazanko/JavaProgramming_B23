package day38_CustomClass;

public class Rectangle {

    public double length;
    public double width;

    /*create a custom class named Rectangle
            Attributes:
    length, width

    Actions:
    setInfo: sets the length and width of the rectangle
    calculateArea(): calculates the area of the rectangle, returns it as double
    calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
    getInfo(): prints the width, length, area and perimeter of the rectangle

     */
//this keyword is used for calling the instances of the object
    public void setInfo(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        double area = length*width;
        return area;
    }

    public double calculatePerimeter(){
        double perimeter = 2* (length+width);
        return perimeter;
    }

    /*public void getInfo(){
        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("Area = " + calculateArea());
        System.out.println("Perimeter = " + calculatePerimeter());
    }
     */

    /*public String toString() { //for printing only
        return "Width: " + width + ", Length: " + length;
    }
     */





    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                " area = " + calculateArea() +
                ", perimeter = " + calculatePerimeter() + "}";
    }
}
