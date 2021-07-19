package day29_ReturnMethods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class WarmupTasks {

    public static void main(String[] args) {

    positiveNegativeZero(40);

        int [] numbers = {10,20,30,0,-50};

        for (int eachNumber : numbers) {
            positiveNegativeZero(eachNumber);
        }

        int[] array1 = {80,2,67,4,5},
                array2 = {6,7,8,-1,10};
        merge2arrays(array1, array2);

        printTheName("cYbErTeK", "SCHOOL");

        printMaximumNumber(4,278);

        int [] array = {1,10,95,48,-3,16};
        printArrayInDescendingOrder(array);

    }
    //1. create a function that can check if the given integer is positive, negative or zero
    public static void positiveNegativeZero (int input){
        if(input>0){
            System.out.println(input + " is positive");
        }
        else if(input<0){
            System.out.println(input + " is negative");
        }
        else{
            System.out.println( input + " equals to zero");
        }
    }

    // 2. create a function that can print out the combination of two integer arrays
    public static void merge2arrays (int[] array1, int[] array2){
        int [] arr3 = new int [array1.length+array2.length];

        int i=0;
        for(int each:array1){
            arr3[i++]=each;
        }

        for(int each : array2){
            arr3[i++]=each;
        }

        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

    }

    /*
    3.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYbErTeK", "SCHOOL");

                output:
                    "Cybertek School"
     */
    public static void printTheName (String firstName, String lastName){
        firstName=firstName.toLowerCase();
        lastName=lastName.toLowerCase();
       String fullName=firstName.substring(0,1).toUpperCase() + firstName.substring(1) + " " +
                lastName.substring(0,1).toUpperCase()+lastName.substring(1);

        System.out.println("fullName = " + fullName);
    }

    //4. create a function that can print out the maximum number between two numbers
    public static void printMaximumNumber (int num1, int num2){

        System.out.println((num1>num2 ? num1:num2) + " is maximum num");
        /*if(num1>num2){
            System.out.println(num1 + " is a maximum number");
        }
        else{
            System.out.println(num2 + " is a maximum number");
        }*/
    }

    // 5. create a function that can print out the array of integers in descending order
    public static void printArrayInDescendingOrder (int [] array){
        int[] result = new int[array.length];
        Arrays.sort(array);
        for (int i = array.length-1, j=0; i >0 ; i--, j++) {
            result[j] = array[i];
        }
        System.out.println(Arrays.toString(result));
    }












}
