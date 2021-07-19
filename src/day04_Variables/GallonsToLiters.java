package day04_Variables;

public class GallonsToLiters {

    /*create a class called GalonsToLiters, and write a program that can convert the gallons tto
            Ex:
                galon = 10;

           Hint: 1 gallon = 3.78541 liters

     */

    public static void main(String[] args) {

        double oneGallon = 3.78541;
        int amountOfGallons = 20;
        double totalLiters = oneGallon*amountOfGallons;
        System.out.println("totalLiters = " + totalLiters);

    }
}
