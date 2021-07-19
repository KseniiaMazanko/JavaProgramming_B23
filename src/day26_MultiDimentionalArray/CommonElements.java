package day26_MultiDimentionalArray;

public class CommonElements {

    public static void main(String[] args) {

        /*
        Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5

          solution 1:
              DO NOT use for each loop

          solution 2:
              MUST use for each loops
         */

        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {4,5,6,7,8};
        int result = 0;

       /* for (int i =0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    result=arr1[i];
                    System.out.print(result + " ");
                }
            }
        }*/
        //second option
        for (int each : arr1) {
            for (int element : arr2) {
                if(element==each){
                    result=element;
                    System.out.print(result + " ");
                }

            }

        }


    }

}
