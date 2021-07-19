package day25_ForEach;

import java.util.Arrays;

public class MergeTwoArrays {

    /*
    write a program that can merge two arrays of integers
        Ex:
            arr1 = {1,2,3,4}
            arr2 = {5,6}

        output
            arr3 = {1,2,3,4,5,6}
     */

    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4};
        int [] arr2 = {5,6};

        int [] arr3 = new int [arr1.length+arr2.length];


        //int j=0;//represents the index numbers of the third array
        for(int i=0; i<arr1.length; i++){//for arr1
            arr3[i++] = arr1[i];//or arr3[j++]=arr2[i]

        }

        for (int i = 0; i < arr2.length; i++) {//for arr2
            arr3[i+arr1.length] = arr2[i];//or arr3[j++]=arr2[i]

        }

        System.out.println(Arrays.toString(arr3));



    }


}
