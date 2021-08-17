package day43_OOP_Encapsulation.ItemsTask;

import day43_OOP_Encapsulation.ItemsTask.Item;

public class MyCart {

    /*
    create a class called MyCart
            create 5 static variables of Items
            Add a static block to to set all the static variables
     */

    public static Item item1, item2, item3, item4,item5;

    static {
        item1 = new Item("apple", 2.50, 5);
        item2 = new Item("milk", 4, 12);
        item3 = new Item("Banana", 0.75, 6);
        item4 = new Item("Honey", 5,1);
        item5=new Item("Toilet paper", 3, 20);
    }





}
