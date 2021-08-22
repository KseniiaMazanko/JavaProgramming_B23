package day46_Inheritance.shapeTask;

import javafx.scene.input.DataFormat;

public class Shape {
        /*
        1. create a class called Shape
						vairables: name, isShape(boolean), hasArea(boolean), hasPerimeter(boolean)

						add a constructor that can set all the fields

						methods: calcArea(), calcPerimeter(),
								 toString(): returns the name, area and perimeter that are returned by calcArea(), calcPerimeter()

		2. create sub classes of Shape:
						Circle
						Rectangle
						Square

			 give the instance variables that are needed to calculate the Area, perimeter, of those shapes

         */

    public final String name;
    public final static boolean isShape, hasArea, hasPerimeter;

    static {
        isShape = true;
        hasArea=true;
        hasPerimeter=true;
    }

    public Shape(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }


    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }



    public String toString() {

        return "Shape{" +
                "name='" + name + '\'' +
                "area=" + area()+'\'' +
                "perimeter = " + perimeter() + '\'' +
                '}';
    }
}
