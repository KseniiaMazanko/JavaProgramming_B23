package day29_ReturnMethods;

import java.util.Arrays;

public class ReturnMethodsPractice3 {


    public static void main(String[] args) {

        String str= "AAAABBBBFRRRKOOOOL";
        System.out.println(removeDuplicatesFromString(str));




    }







    /*
    create a function that removes the duplicates and returns unique elements
     */
    public static String removeDuplicatesFromString (String str){

        String result = "";

        /*for(int i=0; i<str.length(); i++){
            if(!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }
        }
         */
       for(String each:str.split("")){
            if(!result.contains(each)){
                result+=each;
            }
        }
        return result;
    }


    /*
    check if the 2 strings are anagram
     */




}

