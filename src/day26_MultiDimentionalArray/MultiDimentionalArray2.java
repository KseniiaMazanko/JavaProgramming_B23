package day26_MultiDimentionalArray;

import java.util.Arrays;

public class MultiDimentionalArray2 {

    public static void main(String[] args) {

        //int [] nums = {1,2,3};
        //int [] [] nums = { {1,2,3}, {4,5,6}};
        //                      0,1,2    0,1,2          0,1,2     0,1,2
                               // 0         1              0        1
        int [] [] []arr3D = { {{1,2,3}, {4,5,6}}  ,    {{6,2,3}, {4,5,6}}   };
                                    //0                         1

       // [index of 2D arrays] [index of 1D arrays] [index of element]


        System.out.println(Arrays.deepToString(arr3D));//to get the whole multi dimensional array
        System.out.println(Arrays.deepToString(arr3D[1]));//just to get a 2 dimensional array
        System.out.println(Arrays.toString(arr3D[0][1]));//to get a single dimensional array
        System.out.println(arr3D[0][0][2]);//to get the element


        System.out.println("____________________________________________");

        for( int [][] each2d  : arr3D){//for getting each 2d array from 3d
            for (int [] each1d  : each2d){//for getting each 1d array from 2d
                for(int element : each1d){//for getting each element from 1d array
                    System.out.print(element+ " ");
                }
                System.out.println();//to print each dimensional array in a separate line
            }
        }


    }


}
