package day38_CustomClass;


import java.util.ArrayList;
import java.util.Arrays;

public class RectangleTest {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

        /*rectangle1.width = 30;
        rectangle1.length = 20;
         */

        rectangle1.setInfo(30,20);
        rectangle1.length = 25;//reassigning the variable length
        //rectangle1.getInfo();


        System.out.println("________________");

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(50,10);
        //rectangle2.getInfo();


        System.out.println("__________________________");

        System.out.println(rectangle1);//only prints if there is a toString method
        System.out.println(rectangle2);

        System.out.println("________________");



        Rectangle [] arr = {rectangle1, rectangle2};
        System.out.println(arr[0]);//to print 1 object
        System.out.println(arr[1]);
        System.out.println(Arrays.toString(arr));//to print the whole array










    }







}
