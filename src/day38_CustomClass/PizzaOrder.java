package day38_CustomClass;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrder {

    public static void main(String[] args) {


        ArrayList<Pizza> pizzas = new ArrayList<>();

        //add 30 medium size pizzas with 2 cheese toppings and 2 pepperoni toppings

        for(int i=1; i<=30; i++){
            Pizza pizza = new Pizza();
            pizza.customOrder('M', 2, 2);
            pizzas.add(pizza);

        }

        //add80 large pizzas with 3 cheese toppings and 4 pepperoni toppings

        for(int i=1; i<=80; i++){
            Pizza pizza = new Pizza();
            pizza.customOrder('L', 3, 4);
            pizzas.add(pizza);
        }

        //add 38 small pizza 2 cheese toppings and 1 pepperoni topping

        for(int i=1; i<=38; i++){
            Pizza pizza = new Pizza();
            pizza.customOrder('S', 2, 1);
            pizzas.add(pizza);
        }

        System.out.println("Total number of Pizza " + pizzas.size());


        double totalPrice = 0;

        for (Pizza eachPizza : pizzas) {
            totalPrice+= eachPizza.calcCost();
        }
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Total price = $" + df.format(totalPrice));




    }






}
