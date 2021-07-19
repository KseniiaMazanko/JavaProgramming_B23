package day25_ForEach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseEachElement {

    public static void main(String[] args) {

       /* write a program that can  reverse each elements in an array of string
        Ex:
        array = {"Java", "Python", "C#"}

        output:
                ["avaJ", "nohtyP", "#C"]


                2. Write a program that can count how many palindromes
                in an array of strings, do not change the original array

                input:  {anna, level, java}
                output:  2

        */

        String [] array = {"Java", "Python", "C#"};

        for (int j = 0; j < array.length; j++) {

            String element = array[j];

            String reverse = "";//designed to store the reversed version of the element

            for(int i=element.length()-1; i>=0; i--){
                reverse+=element.charAt(i);

            }

            array[j]=reverse;
        }

        System.out.println(Arrays.toString(array));






    }


}
