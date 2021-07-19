package day19_Loops;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {


        System.out.println("Enter a word:");
        String word = new Scanner(System.in).next();
        //String name = "Muhtar";
        String reverseWord = "";

        for(int i=word.length(); i<=0; i--){
            reverseWord += word.charAt(i); //getting the characters starting from last index to index 0
        }
        boolean isPalindrome = word.equalsIgnoreCase(reverseWord);

        System.out.println("isPalindrome = " + isPalindrome);

    }

}
