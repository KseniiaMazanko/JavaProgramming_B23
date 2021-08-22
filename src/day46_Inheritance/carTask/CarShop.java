package day46_Inheritance.carTask;

public class CarShop {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2019, 12_000, "Black", 60_000);
        toyota.start();

        System.out.println("_______________________________________");
        Tesla tesla = new Tesla("S model", 2021, 120000, "red", 0);
        tesla.start();

        System.out.println("________________________________________");
        BMW bmw = new BMW("X6", 2018, 15_000, "White", 50_000);
        bmw.start();





    }



}
