package day23_Arrays;

public class MaximumNumber {

    public static void main(String[] args) {

        //find the maximum number from array
        /*write a program that can find the maximum number from an array of integers
        ex:
        array = {10,5, 4, 400, 50, 0, -1};
        output: 400
         */

        int [] array = {10,5, 4, 400, 50, 0, -1};
        int maxNum = -2147483648;

        for(int i=0; i<= array.length-1; i++){
            if(array[i]>maxNum){
                maxNum=array[i];
            }
        }
        System.out.println("maxNum = " + maxNum);


        /*
        write a program that can find the minimum number from an array of integers
        ex:
        array = {10,5, 4, 400, 50, 0, -1};
        output: -1
        */

        int [] array2 = {10,5, 4, 400, 50, 0, -1};
        int minNum = 2147483647;
        
        for(int i =0; i<= array2.length-1; i++){
            if(minNum>array2[i]){
                minNum=array2[i];
            }
        }
        System.out.println("minNum = " + minNum);

    }

}
