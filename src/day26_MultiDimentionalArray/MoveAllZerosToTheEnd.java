package day26_MultiDimentionalArray;

import java.util.Arrays;

public class MoveAllZerosToTheEnd {

    public static void main(String[] args) {

        int [] array = {10, 0, 5, 0, 1, 0};

        int [] result = new int [array.length];


        for(int i=0, j=0; i<array.length; i++){
            if(array[i] != 0){
                result[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(result));



    }
}
