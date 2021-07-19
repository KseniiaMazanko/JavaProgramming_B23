package day17_StringMethods3;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        /*
    write a program to verify if the gmail is valid
        requirments: a valid gmail accout should end with @gmail.com
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = scan.next();

        //String domain = email.substring(email.indexOf("@");
        //boolean isValidGmail = domain.equals("@gmail.com");

        if(email.endsWith("gmail.com")){
            System.out.println("Valid account");
        }
        else{
            System.out.println("Invalid account");
        }









        /*

        ask the user to enter a word.
        if the word ends with "ly", print "really???" ,  otherwise, print "never mind"


        System.out.println("-------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();

        boolean endsWithLY =  word.substring( word.length()-2).equals("ly");
        boolean endsWithLY2 = word.endsWith("ly");

        if(endsWithLY){
            System.out.println("really?");
        }else{
            System.out.println("Never mind");
        }
         */






    }


}
