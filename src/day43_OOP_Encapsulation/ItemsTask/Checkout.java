package day43_OOP_Encapsulation.ItemsTask;


import java.util.ArrayList;
import java.util.Arrays;
import static day43_OOP_Encapsulation.ItemsTask.MyCart.*;

public class Checkout {

    /*
    Create a class named CheckOut

            1. Create an ArrayList of Items
            2. add all the 5 items from MyCart to the ArrayList items
            3. calculate the total price of all the items (including the tax)
                        Assume that the sales tax is 8%
     */


    public static void main(String[] args) {


        ArrayList<Item> items = new ArrayList<>();

        items.addAll(Arrays.asList(
                //MyCart.item1,MyCart.item2, MyCart.item3, MyCart.item4, MyCart.item5 if there is no static import statement
                item1, item2, item3, item4, item5
        ));

        System.out.println(items);

        //3. calculate the total price of all the items (including the tax)
        //                        Assume that the sales tax is 8%

        double total = 0;
        double tax = 1.08;

        for (Item eachItem : items) {
            total+= eachItem.calcCost()*tax;
        }

        System.out.println(total);




    }



}
