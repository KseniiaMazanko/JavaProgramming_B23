package day33_Methods;

import java.util.Arrays;

public class ReverseArrayOverload {

   /* 1. create a method that can reverse an array of integer

    2. create a method that can reverse an array of double

    3. create a method that can reverse an array of String

    4. create a method that can reverse an array of char
    */
    //  create a method that can reverse an array
    public static int[] reverseArray (int array[] ){

        int[] reversed = new int [array.length];
        for(int i=0, j=array.length-1; i<array.length; i++, j--){
            reversed[i]=array[j];
        }

        return reversed;

    }

    public static double[] reverseArray (double array[] ){

        double[] reversed = new double [array.length];
        for(int i=0, j=array.length-1; i<array.length; i++, j--){
            reversed[i]=array[j];
        }

        return reversed;

    }


    public static String[] reverseArray (String array[] ){

        String[] reversed = new String [array.length];
        for(int i=0, j=array.length-1; i<array.length; i++, j--){
            reversed[i]=array[j];
        }

        return reversed;

    }

    public static char[] reverseArray (char array[] ){

        char[] reversed = new char [array.length];
        for(int i=0, j=array.length-1; i<array.length; i++, j--){
            reversed[i]=array[j];
        }

        return reversed;

    }

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        arr = reverseArray(arr);
        System.out.println(Arrays.toString(arr));


        double [] arr2 = {10.4, 5.4, 9.5, 80.3};
        arr2=reverseArray(arr2);
        System.out.println(Arrays.toString(arr2));

        String [] arr3 = {"hello", "cat", "dog", "lol"};
        arr3 = reverseArray(arr3);
        System.out.println(Arrays.toString(arr3));



    }




}
