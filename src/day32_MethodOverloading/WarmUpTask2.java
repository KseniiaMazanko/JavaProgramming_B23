package day32_MethodOverloading;

import java.util.Arrays;

public class WarmUpTask2 {

    /*
     1. create a return method called addInteger that can add an Integer number
      after the  last index of an integer array

    2. create a return method called addDouble that can add a double number
     after the last index of a double array

    3. create a return method called addString that can add a String after
    the last index of a String array

    4. create a return method called addChar that can add a char after
    last index of a char array
     */

    public static void main(String[] args) {

        //addInteger
        int [] array = {1,2,3,4,5,6,7,8,9};
        int el = 10;
        System.out.println(Arrays.toString(array));

        array=addInteger(array,el);
        System.out.println(Arrays.toString(array));

        array=addInteger(array, 11);
        System.out.println(Arrays.toString(array));

        //addDouble
        double [] arr = {3.3,7.5, 10.2, 9.4};
        System.out.println(Arrays.toString(arr));
        double element = 2.4;

        arr = addDouble(arr, element);
        System.out.println(Arrays.toString(arr));

        //addString
        String [] arr2 = {"hello", "lol", "coffee"};
        System.out.println(Arrays.toString(arr2));
        String str = "bottle";

        arr2 = addString(arr2,str);
        System.out.println(Arrays.toString(arr2));

        //addChar

        char[] arr3 = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(arr3));
        char el2 = 'e';

        arr3 = addChar(arr3, el2);
        System.out.println(Arrays.toString(arr3));


        System.out.println("____________Method Overload______________");
        int [] array1 = {5,6,7,8};
        int num = 9;
        array1 = addElement(array1, num);
        System.out.println(Arrays.toString(array1));

        double [] array2 = {3.5, 4.5, 5.5};
        double num1 = 6.5;
        array2 = addElement(array2, num1);
        System.out.println(Arrays.toString(array2));

        String [] array3 = {"hello", "lol", "coffee"};
        String str2 = "bottle";
        arr2 = addElement(array3,str2);
        System.out.println(Arrays.toString(arr2));

        char [] array4 = {'l', 'm', 's', 'k'};
        char el3 = 'd';
        array4 = addElement(array4,el3);
        System.out.println(Arrays.toString(array4));





    }

    public static int[] addInteger (int[] arr, int num){

       /* int [] result = Arrays.copyOf(arr, arr.length+1);
        result[result.length-1] = num;
        return result;

        */
        int [] result = new int [arr.length+1];
        int i=0;
            for (int each : arr) {
                result[i++] = each;
            }
            result[i] = num;

            return result;
        }

        // 2. create a return method called addDouble that can add a double
        // number after the last index of a double array

    public static double[] addDouble (double[] arr, double num){
        double [] result = new double [arr.length+1];
        int i=0;
        for (double each : arr) {
            result[i++] = each;
        }
        result[i] = num;

        return result;
    }

   /* 3. create a return method called addString that can add a String after
    the last index of a String array*/

    public static String[] addString(String [] arr, String str){
        String [] result = Arrays.copyOf(arr, arr.length+1);
        result[result.length-1]=str;
        return result;
    }
    /*
    4. create a return method called addChar that can add a char after
    last index of a char array
     */
    public static char[] addChar (char[] arr, char el){
        char [] result = Arrays.copyOf(arr, arr.length+1);
        result[result.length-1]= el;
        return result;
    }

    //----------------Method Overloading------------------------------

    public static int[] addElement (int[] arr, int num){
        int [] result = new int [arr.length+1];
        int i=0;
        for (int each : arr) {
            result[i++] = each;
        }
        result[i] = num;

        return result;
    }

    public static double[] addElement (double[] arr, double num){
        double [] result = new double [arr.length+1];
        int i=0;
        for (double each : arr) {
            result[i++] = each;
        }
        result[i] = num;

        return result;
    }

    public static String[] addElement(String [] arr, String str){
        String [] result = Arrays.copyOf(arr, arr.length+1);
        result[result.length-1]=str;
        return result;
    }

    public static char[] addElement (char[] arr, char el){
        char [] result = Arrays.copyOf(arr, arr.length+1);
        result[result.length-1]= el;
        return result;
    }









}
