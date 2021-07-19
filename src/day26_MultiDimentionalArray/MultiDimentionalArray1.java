package day26_MultiDimentionalArray;

import java.util.Arrays;

public class MultiDimentionalArray1 {
    //2 dimensional array MUST contain 1 dimentional arrays

    public static void main(String[] args) {

        int [] [] arr2D = { {1,2,3}, {4,5}, {6,7,8}};
        System.out.println(arr2D.length);

        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(Arrays.deepToString(arr2D));//to print multi-dimentional array

        System.out.println(arr2D[1][1]);//to print the element

        System.out.println("___________________________________");


        for (int i = 0; i < arr2D.length; i++) {// i: index numbers of single dim arrays
            int [] each1DArray = arr2D[i];//retrieve each single dimensional array
            System.out.println(Arrays.toString(each1DArray));
            for(int j=0; j<each1DArray.length; j++){// j is the index of the elements in single dim array
                System.out.println(arr2D[i][j]);//or sout(each1DArray)

            }
        }


        System.out.println("______________________________");

        for (int[] eachArray : arr2D) {
            //System.out.println(Arrays.toString(eachArray));

            for (int element : eachArray) {
                System.out.print(element + " ");
                
            }
            System.out.println();//append new line after printing each element of the array
        }





        

    }




}
