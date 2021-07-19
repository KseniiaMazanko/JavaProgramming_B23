package day24_ForEach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        /*heart && earth
          race && care
         listen && silent

         output:true
         */


        String s1 = "Java";
        String s2 = "Python";

        char [] ch1 = s1.toLowerCase().toCharArray();
        char [] ch2 = s2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean isAnagram = Arrays.equals(ch1,ch2);
        System.out.println("isAnagram = " + isAnagram);


    }


}
