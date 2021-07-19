package day13_Scanner;

import java.util.Scanner;

public class FreeShipping {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of the item:");
        double price = input.nextDouble();

        System.out.println("Are you a Prime member?");
        boolean isPrime = input.nextBoolean();
        
        //double totalPrice = (isPrime)? price:(price>=25)? price:price + 3.99;
    double totalPrice = (isPrime || price>=25)? price:price+3.99;
        System.out.println("totalPrice = $" + totalPrice);

    }

}
