package day43_OOP_Encapsulation.CandiesTask;

import day43_OOP_Encapsulation.CandiesTask.Candy;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    /*
    Create a class named CandyFactory
            Create an ArrayList of candies
            Add five objects of candies
            use for each loop to print the brand and price of each candy
     */

    public static void main(String[] args) {

        ArrayList<Candy> candies = new ArrayList<>();

        candies.addAll(Arrays.asList(
                new Candy("Kinder", 10, 2.5, false),
                new Candy("Snickers", 12, 1.50, true),
                new Candy("Bounty", 20, 1.85, false),
                new Candy("Twix", 15, 0, false),
                new Candy("Lion", 7, 2.25, true)
        ));


        for (Candy each : candies) {
            System.out.println(each);
        }


    }






}
