package day33_Methods;

import utilities.ArrayUtility;

import java.util.Arrays;

public class LunchTasks {

    /*
    1. create method that accepts one integer array and one integer number and returns the frequency of the number
                Ex:
                    int[] array ={1,1,1,1,1,2,2};

                    frequency(array, 1) ==> 5


    2. create method that accepts one double array and one double number and returns the frequency of the number


    3. create method that accepts one String array and one String and returns the frequency of the String
            Ex:
                String[] array = {"Apple", "Apple", "Apple", "Orange"}

                frequency(array, "Orange") ==> 1

    4. create method that accepts one char array and a char and returns the frequency of the char
    */

    public static int frequency(int [] arr, int num){

        int count = 0;

        for(int i=0; i<arr.length; i++){
            if (arr[i] == num){
                count++;
            }
        }
        return count;
    }

    public static int frequency (double[] arr, double num){

        int count = 0;

        for (double each : arr) {
            if(each==num){
                count++;
            }
        }
        return count;
    }

    public static int frequency (String[] arr, String str){

        int count = 0;

        for (String each : arr) {
            if(each.equals(str)){
                count++;
            }

        }
        return count;
    }

    public static int frequency(char [] arr, char el){

        int count = 0;

        for(int i=0; i<arr.length; i++){
            if (arr[i] == el){
                count++;
            }
        }
        return count;
    }


    /*
    1. create a method that can remove the duplicates from an array of integer
            Ex:
              int[] array = {1,1,1,2,2,2,3,4,5,5,5};
              removeDup(array);  ===> {1,2,3,4,5}

        2. create a method that can remove the duplicates from an array of double

        3. create a method that can remove the duplicates from an array of String

        4. create a method that can remove the duplicates from an array of char
            HINT: how did you remove the duplicates from a string?
     */



    public static int[] removeDuplicates (int [] arr){

        int [] result = {};

        for(int i=0; i<arr.length; i++){
            if(!ArrayUtility.contains(result, arr[i])){
                result=ArrayUtility.addElement(result,arr[i]);
            }
        }

    return result;

    }
    public static double[] removeDuplicates (double [] arr){

        double [] result = {};

        for(int i=0; i<arr.length; i++){
            if(!ArrayUtility.contains(result, arr[i])){
                result=ArrayUtility.addElement(result,arr[i]);
            }
        }

        return result;

    }
    public static String[] removeDuplicates (String [] arr){

        String [] result = {};

        for(int i=0; i<arr.length; i++){
            if(!ArrayUtility.contains(result, arr[i])){
                result=ArrayUtility.addElement(result,arr[i]);
            }
        }

        return result;

    }

    public static char[] removeDuplicates (char [] arr){

        char [] result = {};

        for(int i=0; i<arr.length; i++){
            if(!ArrayUtility.contains(result, arr[i])){
                result=ArrayUtility.addElement(result,arr[i]);
            }
        }

        return result;

    }
    
    

   /* Task5:
            1. create a method that can return the unique elements from the array of integers
    Ex:
    int[] array = {1,1,2,3,3,4};

    unique(array) ==> {2, 4};

    2. create a method that can return the unique elements from the array of double

    3. create a method that can return the unique elements from the array of String

    4. create a method that can return the unique elements from the array of char

    */

    public static int[] uniqueElementsFromArray (int[] array){

        int[] result = {};

        for (int each : array) {
            if(frequency(array, each) == 1){ //frequency of each el in the arr and if it is one then the el is uniq
                result = ArrayUtility.addElement(result, each);
            }
        }

        return result;
    }


    public static double[] uniqueElementsFromArray (double[] array){

        double [] resultArr = {};

        for (double each : array) {
            if(frequency(array,each) == 1 ){
                resultArr = ArrayUtility.addElement(resultArr,each);
            }
        }
        return resultArr;

    }

    public static String[] uniqueElementsFromArray (String[] array){

        String [] resultArr = {};

        for (String each : array) {
            if(frequency(array,each) == 1 ){
                resultArr = ArrayUtility.addElement(resultArr,each);
            }
        }
        return resultArr;

    }

    public static char[] uniqueElementsFromArray (char[] array){

        char [] resultArr = {};

        for (char each : array) {
            if(frequency(array,each) == 1 ){
                resultArr = ArrayUtility.addElement(resultArr,each);
            }
        }
        return resultArr;

    }
    
    







    public static void main(String[] args) {

        int[] array ={1,1,1,1,1,2,2};
        int freq = frequency(array, 1);

        System.out.println(freq);


        double [] arr = {0.5, 6.7, 3.9, 10.4, 0.5};
        int freq2=frequency(arr, 0.5);
        System.out.println(freq2);

        String[] array2 = {"Apple", "Apple", "Apple", "Orange"};
        int freq3 = frequency(array2, "Orange");
        System.out.println(freq3);

        char[] arr2 = {'a', 'b', 'c', 'd', 'c'};
        int freq4 = frequency(arr2, 'c');
        System.out.println(freq4);


        int[] array3 = {1,1,1,2,2,2,3,4,5,5,5};
        array3 = removeDuplicates(array3);
        System.out.println(Arrays.toString(array3));



            int[] array5 = {1,2,3,3,4,5,5,6,7};
            array5=uniqueElementsFromArray(array5);

            System.out.println("Unique elements: " + Arrays.toString(array5));



        double [] arr3 = {0.5, 6.7, 3.9, 10.4, 0.5, 10.4, 7.7};
        arr3 = uniqueElementsFromArray(arr3);
        System.out.println(Arrays.toString(arr3));


        String[] array4 = {"Apple", "Apple", "Apple", "Orange", "Cherry"};
        array4 = uniqueElementsFromArray(array4);
        //or create a new arr
        //String [] result3 = uniqueElementsFromArray(array4);
        //System.out.println(Arrays.toString(result3));
        System.out.println(Arrays.toString(array4));


        System.out.println("____________________________________________");
        int[] array6 = {1,1,1,2,3,4,4,4,5,6,6,7};
        array6=removeDuplicates(array6);
        System.out.println(Arrays.toString(array6));

        double [] arr6 = {0.5, 6.7, 3.9, 10.4, 0.5, 10.4, 7.7};
        arr6 = removeDuplicates(arr6);
        System.out.println(Arrays.toString(arr6));

        String[] array7 = {"Apple", "Apple", "Apple", "Orange", "Cherry"};
        array7 = removeDuplicates(array7);
        //or create a new arr
        //String [] result3 = uniqueElementsFromArray(array4);
        //System.out.println(Arrays.toString(result3));
        System.out.println(Arrays.toString(array7));









    }










}
