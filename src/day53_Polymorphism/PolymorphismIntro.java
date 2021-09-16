package day53_Polymorphism;

import day45_Inheritance.employeeTask.Driver;
import day48_Recap.CybertekTask.*;
import day51_Abstraction.shapeTask.Circle;
import day51_Abstraction.shapeTask.Rectangle;
import day51_Abstraction.shapeTask.Shape;
import day51_Abstraction.shapeTask.Square;
import day53_Polymorphism.CarTask.Tesla;
import day53_Polymorphism.WebDriverTask.ChromeDriver;
import day53_Polymorphism.WebDriverTask.WebDriver;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {


        Shape circle = new Circle(5);
        Shape square = new Square(10);
        Shape rectangle = new Rectangle(4,5);

        /*
        WebDriver = new ChromeDriver();
                    new FireFoxDriver();
                    new OperaDriver();

                    driver.get()
         */

        System.out.println("____________________________");

        Shape[] array = {
                new Circle(5),
                new Square(10),
                new Rectangle(4,5)
        };

        System.out.println("_____________________________");

        Employee employee = new Tester(null, 'F', LocalDate.of(1993,10,03),1,"",10);

        boolean isDeveloper = employee instanceof Developer;
        boolean isTester = employee instanceof Tester;
        boolean isPerson = employee instanceof Person;
        boolean isTeacher = employee instanceof Teacher;


        System.out.println("isDeveloper = " + isDeveloper);
        System.out.println("isTester = " + isTester);
        System.out.println("isPerson = " + isPerson);
        System.out.println("isTeacher = " + isTeacher);


        System.out.println("_____________________________");

        ArrayList<Shape> shapes = new ArrayList<>(Arrays.asList(array));
        shapes.addAll(Arrays.asList(
                new Square(50), new Square(40), new Square(20),
                new Circle(10), new Square(20), new Square(20), new Square(20),
                new Rectangle(100,200),new Circle(10),new Circle(10),new Square(30),
                new Square(20)
        ));

    int numberOfSquares = 0,
        numberOfCircles =0,
        numberOfRectangles = 0;
        for (Shape eachShape : shapes) {
            /*if(eachShape.getName().equals("Square")){
                numberOfSquares++;
            }

             */
            if(eachShape instanceof Rectangle){
                numberOfRectangles++;
            }
            else if(eachShape instanceof Circle){
                numberOfCircles++;
            }
            else{
                numberOfSquares++;
            }

        }
        System.out.println("numberOfSquares = " + numberOfSquares);
        System.out.println("numberOfCircles = " + numberOfCircles);
        System.out.println("numberOfRectangles = " + numberOfRectangles);

        System.out.println("______________________________________");

        WebDriver driver = new ChromeDriver();

        if(driver instanceof ChromeDriver){
            System.out.println("Maximize window");
        }
        else{
            System.out.println("Minimize window");
        }


    }

}
