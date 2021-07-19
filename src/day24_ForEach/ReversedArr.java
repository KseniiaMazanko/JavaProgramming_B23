package day24_ForEach;

import java.util.Arrays;

public class ReversedArr {

    public static void main(String[] args) {

        /*
        Write a program that can reverse an array of integers
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

         */

        int [] array = {1,2,3,4,5};

        int [] reversedArray = new int[array.length];

       /* reversedArray[0] = array[4];
        reversedArray[1] = array[3];
        reversedArray[2] = array[2];
        reversedArray[3] = array[1];
        reversedArray[4] = array[0];
        */

        for (int i = array.length-1, j=0; i >=0 ; i--, j++) { //i is the existing array starting from the last index
                                                                // j is the reversed array from 0 index

            reversedArray[j] = array[i];

        }


         //*/



        /*or 2nd option
        int j=0;
        for(int i = array.length-1; i >=0 ; i--){
            reversedArray[j++] = array[i];
        }
         */

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversedArray));


    }

}
