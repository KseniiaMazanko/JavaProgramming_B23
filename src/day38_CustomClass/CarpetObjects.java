package day38_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {

/*
create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        regularCarpets
        write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets

                    use for each loop to print out all the persian carpets
 */


    public static void main(String[] args) {

        Carpet carpet1 = new Carpet();
        Carpet carpet2 = new Carpet();
        Carpet carpet3 = new Carpet();
        Carpet carpet4 = new Carpet();
        Carpet carpet5 = new Carpet();

        carpet1.customOrder(5.5, 12.7, 100, false);
        carpet2.customOrder(7.4, 14.6, 150, true);
        carpet3.customOrder(8.8, 16.4, 120, false);
        carpet4.customOrder(5.7, 11.3, 200, true);
        carpet5.customOrder(9.2, 18.3, 170, false);


        //System.out.println(carpet1);
        //System.out.println(carpet2);


        System.out.println("_____________________________________________________");




        Carpet [] arrayOfCarpets = {carpet1, carpet2, carpet3, carpet4, carpet5};

        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        ArrayList<Carpet> regularCarpets = new ArrayList<>();

       /* persianCarpets.addAll(Arrays.asList(arrayOfCarpets));
        persianCarpets.removeIf(carpet -> !carpet.isPersian);
        System.out.println(persianCarpets);

        */

        for (Carpet each : arrayOfCarpets) {
            if(each.isPersian){
                persianCarpets.add(each);
            }
            else{
                regularCarpets.add(each);
            }
        }


        System.out.println(persianCarpets.size());

        for (Carpet eachPersian : persianCarpets) {
            System.out.println(eachPersian);
        }

        System.out.println(regularCarpets.size());
        for (Carpet eachRegular : regularCarpets) {
            System.out.println(eachRegular);
        }


    }






}
