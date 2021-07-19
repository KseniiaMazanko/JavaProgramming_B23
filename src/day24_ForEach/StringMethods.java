package day24_ForEach;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        /*split(value): returns string array, splits the string by given value

        String sentence = "I love Java programming";
        sentence.split(" "); ==> {"I", "love", "Java", "Programming"}
         */

        String sentence = "I love learning Java programming language";

        String [] words = sentence.split(" ");
        String [] reversed = new String[words.length];

        System.out.println(Arrays.toString(words));

        for(int i=words.length-1, j=0; i>=0; i--, j++){
            reversed[j] = words[i]; //creates the new reversed array
        }
        /*or
        for(int i= words.length-1; i>=0; i--){
            System.out.println(words[i]); //just prints
        }
        */


        System.out.println(Arrays.toString(reversed));

        String email = "James@gmail.com";
        String firstName =  email.split("@")[0];
        System.out.println("firstName = " + firstName);


        //toCharArray(): returns char array

        String str = "A,B C D E ! #";
        char [] arrOfChars = str.toCharArray();
        System.out.println(Arrays.toString(arrOfChars));






    }

}
