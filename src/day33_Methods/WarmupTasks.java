package day33_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import utilities.ArrayUtility; //to import methods from Arras utility. first-name of the package, then name of the class

public class WarmupTasks {

    //remove the element at the given index of the arra

    public static int[] remove(int[] array, int index){

        if(index<0 || index>array.length-1){
            System.out.println("Invalid index");
        }


            int [] result = new int[array.length-1];
            for(int i=0, j=0; i< array.length; i++){
                if(i==index){
                    continue;
                }
                else{
                    result[j++]=array[i];
                }
            }
            return result;

    }


    public static double[] remove(double[] array, int index){

        if(index<0 || index>array.length-1){
            System.out.println("Invalid index");
        }


        double [] result = new double[array.length-1];
        for(int i=0, j=0; i< array.length; i++){
            if(i==index){
                continue;
            }
            else{
                result[j++]=array[i];
            }
        }
        return result;

    }

    public static String[] remove(String[] array, int index){

        if(index<0 || index>array.length-1){
            System.out.println("Invalid index");
        }


        String [] result = new String[array.length-1];
        for(int i=0, j=0; i< array.length; i++){
            if(i==index){
                continue;
            }
            else{
                result[j++]=array[i];
            }
        }
        return result;

    }
    
    

    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400};
        System.out.println(Arrays.toString(numbers));

        int[] result = remove(numbers, 2);
        System.out.println(Arrays.toString(result));

        double [] nums = {3.4, 6.7, 20, 4};
        double [] result2 = remove(nums, 0);
        System.out.println(Arrays.toString(result2));


        String [] students = {"Dilem", "Sabir", "Bob", "Natalia", "Robert"};
        students=remove(students, 3);
        System.out.println(Arrays.toString(students));

        System.out.println("___________________________________");

        char [] chars1 = {'A', 'B', 'C', 'D', 'E'};
        char [] chars2 = {'F', 'G', 'H', 'I', 'J'};

        char [] result3 = ArrayUtility.mergeTwoArrays(chars1, chars2);
        System.out.println(Arrays.toString(result3));


    }



}



/*
Task2:
    1. create a method that accepts two parameters: one integer array and one integer number.
    The method returns true if the number is contained in the integer array, otherwise returns false
 */
