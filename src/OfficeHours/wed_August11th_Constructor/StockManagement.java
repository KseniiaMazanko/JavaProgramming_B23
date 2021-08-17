package OfficeHours.wed_August11th_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class StockManagement {

    /*
    ==	Create a class called StockManagement
			- Create an Arraylist called products (Product)

			use static block
				- to initialize products
     */

    public static ArrayList<Product> electronics = new ArrayList<>();
    public static ArrayList<Product> kitchen = new ArrayList<>();
    public static ArrayList<Product> toys = new ArrayList<>();

    static {

        electronics.addAll(Arrays.asList(
                new Product("Laptop", 3, 950),
                new Product("Phone", 5, 700),
                new Product("Headphones", 10, 150),
                new Product("Watch", 7, 550)
        ));

        kitchen.addAll(Arrays.asList(
                new Product("Cup", 50, 5),
                new Product("Fork", 100, 3.50),
                new Product("Plate", 80, 4),
                new Product("Spoon", 30, 2),
                new Product("Cutting board", 60, 7)
        ));

        toys.addAll(Arrays.asList(
                new Product("Bear", 7, 50),
                new Product("Lion", 15, 75),
                new Product("Barbi", 20, 10)
        ));





    }




}
