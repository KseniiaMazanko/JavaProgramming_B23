package day04_Variables;

import java.util.Arrays;

public class Car {

    public static void main(String[] args) {

        String brand = "Toyota",
                model = "Camry",
                color = "White";

        int year = 2015,
                miles = 45000;

        double price = 25000;

        System.out.println(year +" "+ brand +" " + model + ", "+ color + ", " + miles + " miles, " + "$" + price);


        String word = "JavaScript";
        System.out.println("My favourite language is " + word);

        int [] arr = new int[9];
        System.out.println(arr[8]);


    }

}
