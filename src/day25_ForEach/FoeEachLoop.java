package day25_ForEach;

import java.util.Arrays;

public class FoeEachLoop {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("_____________________");

        //pre-condition: there MUST be a data structure

        //syntax:

        // for(DataType   Variable    : Collection of Data){
   // }             DataType MUST match with collection of Data


        for( int each : numbers)   { //represents each element of the array, no access to indexes
            System.out.println(each);
        }

        System.out.println("________________");

        String [] names = {"Ahmet","Viktoria","Yulia","Abbos","Sabir"};

       // Arrays.sort(names);

        for ( String eachName  : names){ //there is no indexes in forEach loop
            System.out.println(eachName);
        }

        //we can use forEach loop if we don't need to use indexes


    }
}
