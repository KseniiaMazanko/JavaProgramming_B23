package day24_ForEach;

public class UniqueElements {

    public static void main(String[] args) {

        /*write a program that can print out the unique numbers from an array of integers
        Ex:
        int[] arr ={1,1,2,3,3,4}

        output:
        2 4
        */


        int[] arr ={1,1,2,3,3,4};


        for (int j = 0; j < arr.length; j++) {//used to repeat the frequency search for every element

            int element = arr[j];//1
            int count = 0;//to store the frequency

            for (int i = 0; i < arr.length; i++) {//used for finding the frequency of one element at a time
                if(arr[i] == element){//if the element is occurred in the array
                    count++;
                }
            }
            if(count==1){//to check if the element is unique
                System.out.print(element + " ");
            }

        }






    }

}
