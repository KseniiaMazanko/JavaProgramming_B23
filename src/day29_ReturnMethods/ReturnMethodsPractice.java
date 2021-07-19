package day29_ReturnMethods;

import java.util.Arrays;

public class ReturnMethodsPractice {

    public static void main(String[] args) {


        //int max = max(10,20);
        //System.out.println(max);

        int number [] = {10,4,0,-1,7};
        int max = number[0];

        for (int each : number){
            max = max(each, max);
        }

        System.out.println(max);



        int [] array = {94, 36, -200, 78, 362, -3875};

        int maximumNum = maxNumberFromIntArray(array);
        int minNumber = minNumberFromIntArray(array);

        System.out.println(maximumNum);
        System.out.println(minNumber);

    }

    public static int max (int a, int b){

        /*int max =0;
        if(a>b){
            max=a;
        }
        else{
            max=b;
        }
        return max;

         */

        return (a>b)? a:b; //short way
    }

    public static int min(int a, int b){
        return (a<b)? a:b;
    }


    public static int maxNumberFromIntArray (int[] numbers){
        int max = numbers[0];
        for(int number:numbers){
            max=max(max,number);
        }
        return max;
    }

    public static int minNumberFromIntArray (int[] numbers){
        int min = numbers[0];
        for(int number:numbers){
            min=min(min,number);
        }
        return min;
    }

}
