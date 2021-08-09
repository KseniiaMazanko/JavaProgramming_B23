package day40_CustomClassStatic;

import java.util.Scanner;

public class AddressObjects {

    public static void main(String[] args) {

        Address address = new Address();
        Scanner scan = new Scanner(System.in);//enter

        System.out.println("Enter building number");
        String building = scan.next();//7925

        scan.nextLine();//clear out the scanner

        System.out.println("Enter your street name");
        String street = scan.nextLine();

        System.out.println("Enter your city name");
        String city = scan.nextLine();

        System.out.println("Enter your state name");
        String state = scan.nextLine();

        System.out.println("Enter your zipCode");
        int zipCode = scan.nextInt();

        address.setInfo(building, street, city, state, zipCode);
        System.out.println(address);

    }




}
