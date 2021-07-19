package day19_Loops;

import java.util.Scanner;

public class RemoveDuplicatesIfmethod {

   /* ask the user to enter a word. the word must be five characters long and print
   the word without the duplicated characters, but if the word is less than five characters long, print "Too Short."
   and if the word is more than five characters long, print "Too long."

    Ex:
    input:
    aabbc

    output:
    abc
    /*

    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word five characters long:");
        String word = scan.next();
        String result = "";

        if(word.length() == 5){
            if(!result.contains("" + word.charAt(0))){
                result +=word.charAt(0);
            }
            if(!result.contains("" + word.charAt(1))){
                result +=word.charAt(1);
            }
            if(!result.contains("" + word.charAt(2))){
                result +=word.charAt(2);
            }
            if(!result.contains("" + word.charAt(3))){
                result +=word.charAt(3);
            }
            if(!result.contains("" + word.charAt(4))){
                result +=word.charAt(4);
            }


        }
        else if(word.length()<5){
            result = "Too short";
        }
        else {
            result = "Too long";
        }

        System.out.println(result);



    }

}
