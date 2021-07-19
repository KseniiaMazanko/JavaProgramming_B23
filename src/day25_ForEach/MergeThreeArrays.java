package day25_ForEach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeThreeArrays {


    public static void main(String[] args) {

        int [] arr1 = {1,2,3},
                arr2  = {4,5,6},
                arr3 = {7,8,9,12, 13,14};

        int [] arr4 = new int[arr1.length +arr2.length+arr3.length];


        //int j=0;
        for (int i = 0; i < arr1.length; i++) {
            arr4[i] = arr1[i];
            //arr[j++]=arr[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr4[i+arr1.length+arr2.length] = arr2[i];
            //arr[j++]=arr[i]; second option
        }

        for (int i = 0; i < arr3.length; i++) {
            arr4[i+arr1.length+arr2.length] = arr3[i];
            //arr[j++]=arr[i];
        }

        System.out.println(Arrays.toString(arr4));



    }
}
