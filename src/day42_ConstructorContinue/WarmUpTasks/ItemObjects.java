package day42_ConstructorContinue.WarmUpTasks;

import day42_ConstructorContinue.WarmUpTasks.Item;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemObjects {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        items.addAll(Arrays.asList(
                new Item("Milk", 5, 2),
                new Item("Cheese", 3, 3),
                new Item("Tea", 3, 20),
                new Item("Kiwi", 10, 3),
                new Item("Apples", 5, 9)
        ));

        //items.removeIf(item -> item.unitPrice>3); if I wanna remove the items that cost >3

        double totalPrice = 0;

        for (Item eachItem : items) {
            totalPrice+=eachItem.calcCost();
        }

        System.out.println(totalPrice);





    }



}
